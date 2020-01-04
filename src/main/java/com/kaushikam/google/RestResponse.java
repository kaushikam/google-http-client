package com.kaushikam.google;

import com.google.api.client.util.Key;

public class RestResponse {
    @Key
    private String message;

    public RestResponse() {}

    public RestResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "RestResponse{" +
            "message='" + message + '\'' +
            '}';
    }
}
