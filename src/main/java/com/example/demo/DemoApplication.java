package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/ok")
    public String ok() {
        return "OK!";
    }

    @PostMapping("/process")
    public MyResponse handlePostRequest(@RequestBody MyRequest request) {
        String dataFromRequest = request.getData();
        MyResponse response = new MyResponse();
        response.setResponseData(dataFromRequest);
        return response;
    }
}

class MyRequest {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

class MyResponse {
    private String responseData;

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }
}
