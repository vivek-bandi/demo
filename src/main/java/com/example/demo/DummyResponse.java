package com.example.demo;

public class DummyResponse {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private  String message;

    public DummyResponse(String msg){
        this.message = msg;
    }
}
