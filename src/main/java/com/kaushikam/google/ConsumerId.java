package com.kaushikam.google;

import com.google.api.client.util.Key;

public class ConsumerId {
    @Key
    private String _id;

    ConsumerId(String _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return _id;
    }
}
