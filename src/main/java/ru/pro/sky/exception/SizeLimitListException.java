package ru.pro.sky.exception;

public class SizeLimitListException extends RuntimeException {

    public SizeLimitListException() {
    }

    public SizeLimitListException(String message) {
        super(message);
    }

    public SizeLimitListException(String message, Throwable cause) {
        super(message, cause);
    }

    public SizeLimitListException(Throwable cause) {
        super(cause);
    }

    public SizeLimitListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
