package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MyTestController {

    @GetMapping("/")
    public Map<String, Object> getValues(){
        Map<String, Object> data=new HashMap<>();
        data.put("message2", "...........This is SpringBootApp listening at port 9595 ..............");
        data.put("languages", Arrays.asList("Java", "Python", "Javascript"));
        data.put("code", 2345);
        return data;

    }

}
