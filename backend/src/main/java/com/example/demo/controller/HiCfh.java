package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/hi-cfh")
public class HiCfh {

    @GetMapping("/")
    public ResponseEntity<String> hi() {
        return ResponseEntity.ok("Hi Cfh");
    }

}
