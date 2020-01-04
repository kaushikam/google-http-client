package com.kaushikam.google;

public class ApiError {
    private Integer errorCode;
    private String message;

    public ApiError() {}

    public ApiError(
        Integer errorCode,
        String message
    ) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ApiError{" +
            "errorCode=" + errorCode +
            ", message='" + message + '\'' +
            '}';
    }
}
