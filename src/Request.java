public class Request {
    public enum Type { SIMPLE, COMPLEX, CRITICAL };
    public Type type;
    public String message;

    public Request(Type type, String message) {
        this.type = type;
        this.message = message;
    }
}