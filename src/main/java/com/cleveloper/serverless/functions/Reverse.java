package com.cleveloper.serverless.functions;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("reverse")
public class Reverse implements Function<String, String> {
    @Override
    public String apply(String value) {
        return new StringBuilder(value).reverse().toString();
    }
}
