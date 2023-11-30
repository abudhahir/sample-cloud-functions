package com.cleveloper.serverless.functions.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;


public class Config {

    public Function<String, String> uppercase() {
        return value -> value.toUpperCase();
    }
}
