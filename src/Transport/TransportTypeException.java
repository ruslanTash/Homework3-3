package Transport;

public class TransportTypeException extends Exception{
    public TransportTypeException(String message) {
        super(message);
    }

    public TransportTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransportTypeException(Throwable cause) {
        super(cause);
    }

    public TransportTypeException() {
    }

    @Override
    public String getMessage() {
        return "Автобусы проходить диагностику не должны";
    }
}
