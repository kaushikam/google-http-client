package com.kaushikam.google;

import com.google.api.client.http.HttpResponseException;
import com.google.gson.Gson;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws Exception {
        RestClient client = new RestClient();
        RestRequest request = new RestRequest("12345678901");
        try {
            RestResponse response = client.getRestResponse(request);
            System.out.println(response);
        } catch (IOException e) {
            if (e instanceof HttpResponseException) {
                HttpResponseException ex = (HttpResponseException) e;
                ApiError error = getApiError(ex.getContent()).getError();
                switch (error.getErrorCode()) {
                    case 1:
                        throw new ConsumerNotFoundException(error.getMessage());
                    case 0:
                        throw new InvalidConsumerIdException(error.getMessage());
                }
            }
        }
    }

    private static ApiErrorContainer getApiError(String content) {
        Gson gson = new Gson();
        return gson.fromJson(content, ApiErrorContainer.class);
    }
}
