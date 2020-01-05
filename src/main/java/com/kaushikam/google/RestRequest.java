package com.kaushikam.google;

import com.google.api.client.util.Key;

public class RestRequest {
    @Key
    private String consumerId;

    RestRequest() {}

    RestRequest(String consumerId) {
        this.consumerId = consumerId;
    }

    @Override
    public String toString() {
        return "RestRequest{" +
            "consumerId=" + consumerId +
            '}';
    }
}
