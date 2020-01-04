package com.kaushikam.google;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.http.json.JsonHttpContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;

class RestClient {

    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new JacksonFactory();

    RestResponse getRestResponse(
        RestRequest requestEntity
    ) throws IOException {
        GenericUrl messageUrl = new GenericUrl("http://localhost:8080/v1/hello");
        HttpContent requestContent = new JsonHttpContent(JSON_FACTORY, requestEntity);
        HttpResponse response = requestFactory().buildPostRequest(
            messageUrl, requestContent
        ).execute();
        Type type = new TypeToken<RestResponse>(){}.getType();
        return (RestResponse) response.parseAs(type);
    }

    private HttpRequestFactory requestFactory() {
        return HTTP_TRANSPORT.createRequestFactory(
            new HttpRequestInitializer() {
                @Override
                public void initialize(HttpRequest httpRequest) throws IOException {
                    httpRequest.setConnectTimeout(60000);
                    httpRequest.setReadTimeout(60000);
                    httpRequest.setParser(JSON_FACTORY.createJsonObjectParser());
                }
            }
        );
    }
}
