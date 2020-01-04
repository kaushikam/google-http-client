package com.kaushikam.google;

import com.google.api.client.util.Key;

public class RestRequest {
    @Key
    private ConsumerId consumerId;

    RestRequest() {}

    RestRequest(ConsumerId consumerId) {
        this.consumerId = consumerId;
    }

    @Override
    public String toString() {
        return "RestRequest{" +
            "consumerId=" + consumerId +
            '}';
    }
}
