package Homework6;

class ValidationException extends Throwable {
    private String message;

    public ValidationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
