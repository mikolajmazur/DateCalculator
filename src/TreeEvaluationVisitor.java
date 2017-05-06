import java.time.Duration;
import java.time.LocalDateTime;

public final class TreeEvaluationVisitor extends DateCalculatorBaseVisitor<DateAndTimeSpanWrapper> {
    @Override
    public DateAndTimeSpanWrapper visitData(DateCalculatorParser.DataContext ctx) {
        int formatId = ctx.format.getType();
        String text = ctx.getText();
        LocalDateTime parsedDateTime = Formatter.parseDate(text, formatId);
        return new DateAndTimeSpanWrapper(parsedDateTime, DateAndTimeSpanWrapper.Type.DATA_CZAS);
    }

    @Override
    public DateAndTimeSpanWrapper visitDataCzas(DateCalculatorParser.DataCzasContext ctx) {
        int formatId = ctx.format.getType();
        String text = ctx.getText();
        LocalDateTime parsedDateTime = Formatter.parseDateTime(text, formatId);
        return new DateAndTimeSpanWrapper(parsedDateTime, DateAndTimeSpanWrapper.Type.DATA_CZAS);
    }

    @Override
    public DateAndTimeSpanWrapper visitPrzedzialCzasu(DateCalculatorParser.PrzedzialCzasuContext ctx) {
        int formatId = ctx.format.getType();
        String text = ctx.getText();
        Duration duration = Formatter.parseDuration(text, formatId);
        return new DateAndTimeSpanWrapper(duration, DateAndTimeSpanWrapper.Type.PRZEDZIAL_CZASU);
    }

    @Override
    public DateAndTimeSpanWrapper visitOperation2(DateCalculatorParser.Operation2Context ctx) {
        DateAndTimeSpanWrapper left = visit(ctx.getChild(0));
        DateAndTimeSpanWrapper right = visit(ctx.getChild(2));
        DateAndTimeSpanWrapper result = null;

        if(ctx.op.getType() == DateCalculatorParser.Add){
            // datetime/date + timespan
            boolean areDateTimePlusTimespan = left.getType() == DateAndTimeSpanWrapper.Type.DATA_CZAS
                                              && right.getType() == DateAndTimeSpanWrapper.Type.PRZEDZIAL_CZASU;
            if (areDateTimePlusTimespan){
                LocalDateTime lhs = (LocalDateTime) left.getObject();
                Duration rhs = (Duration)right.getObject();
                LocalDateTime out = lhs.plus(rhs);
                result = new DateAndTimeSpanWrapper(out, DateAndTimeSpanWrapper.Type.DATA_CZAS);
            }

            // timespan + timespan
            boolean areBothAreDuration = left.getType() == DateAndTimeSpanWrapper.Type.PRZEDZIAL_CZASU
                                      && right.getType() == DateAndTimeSpanWrapper.Type.PRZEDZIAL_CZASU;
            if (areBothAreDuration){
                Duration lhs = (Duration)left.getObject();
                Duration rhs = (Duration)right.getObject();
                Duration out = lhs.plus(rhs);
                result = new DateAndTimeSpanWrapper(out, DateAndTimeSpanWrapper.Type.PRZEDZIAL_CZASU);

            }

            boolean areDurationPlusDate = left.getType() == DateAndTimeSpanWrapper.Type.PRZEDZIAL_CZASU
                                          && right.getType() == DateAndTimeSpanWrapper.Type.DATA_CZAS;
            if (areDurationPlusDate){
                Duration lhs = (Duration)left.getObject();
                LocalDateTime rhs = (LocalDateTime) right.getObject();
                LocalDateTime out = rhs.plus(lhs);
                result = new DateAndTimeSpanWrapper(out, DateAndTimeSpanWrapper.Type.DATA_CZAS);
            }
        } else{
            // datetime/date - timespan
            boolean areDateTimeAndTimeSpan = left.getType() == DateAndTimeSpanWrapper.Type.DATA_CZAS
                                             && right.getType() == DateAndTimeSpanWrapper.Type.PRZEDZIAL_CZASU;
            if (areDateTimeAndTimeSpan){
                LocalDateTime lhs = (LocalDateTime) left.getObject();
                Duration rhs = (Duration) right.getObject();
                LocalDateTime out = lhs.minus(rhs);
                result = new DateAndTimeSpanWrapper(out, DateAndTimeSpanWrapper.Type.DATA_CZAS);
            }

            // datetime/date - datetime/date
            boolean areDateTimeMinusDateTime = left.getType() == DateAndTimeSpanWrapper.Type.DATA_CZAS
                                               && right.getType() == DateAndTimeSpanWrapper.Type.DATA_CZAS;
            if (areDateTimeMinusDateTime){
                LocalDateTime lhs = (LocalDateTime) left.getObject();
                LocalDateTime rhs = (LocalDateTime) right.getObject();
                Duration out = Duration.between(rhs, lhs);
                result = new DateAndTimeSpanWrapper(out, DateAndTimeSpanWrapper.Type.PRZEDZIAL_CZASU);
            }

            // timespan - timespan
            boolean areTimeSpanAndTimeSpan = left.getType() == DateAndTimeSpanWrapper.Type.PRZEDZIAL_CZASU
                                             && right.getType() == DateAndTimeSpanWrapper.Type.PRZEDZIAL_CZASU;
            if (areTimeSpanAndTimeSpan){
                Duration lhs = (Duration) left.getObject();
                Duration rhs = (Duration) right.getObject();
                Duration out = lhs.minus(rhs);
                result = new DateAndTimeSpanWrapper(out, DateAndTimeSpanWrapper.Type.PRZEDZIAL_CZASU);
            }
        }

        if (result == null){
            throw new IllegalArgumentException("operation didn't match any actual operation");
        }
        return result;
    }
}
