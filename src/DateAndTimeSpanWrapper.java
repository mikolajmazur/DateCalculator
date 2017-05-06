public class DateAndTimeSpanWrapper {
    public enum Type {DATA, DATA_CZAS, PRZEDZIAL_CZASU}

    private final Object object;
    private final Type type;

    public DateAndTimeSpanWrapper(Object object, Type type){
        this.object = object;
        this.type = type;
    }

    public Object getObject(){
        return object;
    }

    public Type getType(){
        return type;
    }
}
