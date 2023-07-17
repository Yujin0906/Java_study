public class CarException extends RuntimeException {
    private String errorMsg;

    public CarException(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String getMessage() {
        return errorMsg;
    }
}
