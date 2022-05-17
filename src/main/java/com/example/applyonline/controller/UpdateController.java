package com.example.applyonline.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UpdateController {

    @GetMapping
    public String getHome(){
        return "Hello World";
    }
}
