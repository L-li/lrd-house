package com.BuilderPattern;

import com.sun.net.httpserver.Headers;
import javafx.application.Application;

import javax.security.auth.login.Configuration;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.Policy;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toList;

/**
 * Created by Administrator on 2017/12/28.
 */
public class HttpRequest {
    private String url;
    private Headers headers;
    private Parameters parameters;

    public static class Headers {
        public static final String ContentType = "Content-Type";
        private Map<String, String> headers = new HashMap<>();

        public String get(String field) {
            return headers.getOrDefault(field, "");
        }

        private void put(String field, String value) {
            headers.put(field, value);
        }

        public interface OptionalHeader {

            OptionalHeader header(String field, String value);

            Headers build();

        }

        public static Headers.OptionalHeader header(String field, String value) {
            return new Headers.Builder(field, value);
        }

        public static class Builder implements OptionalHeader {

            Headers headerInstance = new Headers();

            public Builder(String field, String value) {
                headerInstance.put(field, value);
            }

            @Override
            public OptionalHeader header(String field, String value) {
                headerInstance.put(field, value);
                return this;
            }

            @Override
            public Headers build() {
                return headerInstance;
            }

        }

    }
    public static class Parameters{
        private Map<String, String> parameters = new HashMap<>();
        public String get(String key) {
            return parameters.getOrDefault(key, "");
        }

        private void put(String key, String value) {
            parameters.put(key, value);
        }

        public String getQueryString() {
            return String.join("&",
                    parameters.entrySet().stream()
                            .map(e -> encode(e.getKey()) + "=" + encode(e.getValue()))
                            .collect(toList()));
        }

        private String encode(String string)  {
            try {
                return URLEncoder.encode(string, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                return "";  // Happens when UTF-8 is not supported
            }
        }

        public interface OptionalParameter {

            OptionalParameter parameter(String field, String value);

            Parameters build();

        }

        public static Parameters.OptionalParameter parameter(String key, String value) {
            return new Parameters.Builder(key, value);
        }

        public static class Builder implements OptionalParameter {

            Parameters parameterInstance = new Parameters();

            public Builder(String key, String value) {
                parameterInstance.put(key, value);
            }

            @Override
            public OptionalParameter parameter(String key, String value) {
                parameterInstance.put(key, value);
                return this;
            }

            @Override
            public Parameters build() {
                return parameterInstance;
            }

        }
    }

}
