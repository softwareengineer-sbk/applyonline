package com.example.applyonline.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap1/v1")
public class UpdateController {

    @PostMapping("/update")
    public void getUpdates(@RequestBody String json){
        System.out.println(json);
    }
}
