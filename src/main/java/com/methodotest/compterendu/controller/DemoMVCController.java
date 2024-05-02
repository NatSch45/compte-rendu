package com.methodotest.compterendu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoMVCController {

    @GetMapping("/displayMessage")
    public ResponseEntity<String> displayMessage() {
        String msg = "Hello Ynov !";
        System.out.println(msg);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
