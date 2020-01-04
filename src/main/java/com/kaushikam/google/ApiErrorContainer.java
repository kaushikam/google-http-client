package com.kaushikam.google;

public class ApiErrorContainer {
    private ApiError error;

    public ApiErrorContainer() {}

    public ApiErrorContainer(ApiError error) {
        this.error = error;
    }

    public ApiError getError() {
        return error;
    }

    @Override
    public String toString() {
        return "ApiErrorContainer{" +
            "error=" + error +
            '}';
    }
}
