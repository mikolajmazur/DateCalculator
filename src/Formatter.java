import org.antlr.v4.runtime.Token;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatter {
    public static LocalDateTime parseDate(String text, int formatId){
        DateTimeFormatter formatter = getDateFormatterFor(formatId);
        LocalDate date = LocalDate.parse(text, formatter);
        LocalTime time = LocalTime.MIN;

        return date.atTime(time);
    }

    public static LocalDateTime parseDateTime(String text, int formatId){
        DateTimeFormatter formatter = getDateFormatterFor(formatId);
        return LocalDateTime.parse(text, formatter);
    }

    public static Duration parseDuration(String text, int formatId){
        if (formatId == DateCalculatorParser.PrzedzialCzasuDwukropki){
            String[] parts = text.split(":");
            text = "PT" + parts[1] + "H" + parts[2] + "M" + parts[3] + "S";
        } else if (formatId != DateCalculatorParser.PrzedzialCzasuJava){
            throw new IllegalArgumentException(text + " is not a valid Duration");
        }

        return Duration.parse(text);
    }

    private static DateTimeFormatter getDateFormatterFor(int formatID){
        DateTimeFormatter formatter;

        switch (formatID){
            case DateCalculatorParser.DataDMMMMR: {
                Locale locale = new Locale("pl");
                formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", locale);
                break;
            }
            case DateCalculatorParser.DataDMRKropka:
                formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
                break;
            case DateCalculatorParser.DataDMRMyslnik:
                formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
                break;
            case DateCalculatorParser.DataMDRSlash:
                formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
                break;
            case DateCalculatorParser.DataCzasDMMMMR: {
                Locale locale = new Locale("pl");
                formatter = DateTimeFormatter.ofPattern("d MMMM yyyy H:m:s", locale);
                break;
            }
            case DateCalculatorParser.DataCzasDMRKropka:
                formatter = DateTimeFormatter.ofPattern("d.M.yyyy h:m:sa");
                break;
            case DateCalculatorParser.DataCzasMDRSlash:
                formatter = DateTimeFormatter.ofPattern("M/d/yyyy h:m:sa");
                break;
            case DateCalculatorParser.DataCzasISO:
                formatter = DateTimeFormatter.ofPattern("d-M-yyyy'T'H:m:s");
                break;
            default:
                throw new IllegalArgumentException("formatID does not match any format");
        }

        return formatter;
    }
}
