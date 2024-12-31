package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoEndPoint {
    @GetMapping(value = "/hello",produces = "application/json")
    public DummyResponse hello(){
        return new DummyResponse("hello vivek");
    }
}
