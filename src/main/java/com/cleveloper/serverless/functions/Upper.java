package com.cleveloper.serverless.functions;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("upper")
public class Upper implements Function<String, String> {
    @Override
    public String apply(String value) {
        return value.toUpperCase();
    }
}
