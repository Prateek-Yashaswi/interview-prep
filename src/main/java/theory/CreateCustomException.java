package theory;

public class CreateCustomException extends RuntimeException {
    private static final String UNKNOWN_ERROR = "UNKNOWN ERROR";
    private final int code;
    private final String message;

    public CreateCustomException(String message, int code) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public CreateCustomException(int code) {
        super(UNKNOWN_ERROR);
        this.code = code;
        this.message = UNKNOWN_ERROR;
    }
}
