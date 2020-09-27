package com.chainalysis.k8demo;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/")
public class HelloService {
    @Get 
    @Produces(MediaType.TEXT_PLAIN) 
    public String index() {
        return "Hello World"; 
    }
}