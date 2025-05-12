package com.chamod.chatbot.controller;

import com.chamod.chatbot.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ResponseEntity<ApiResponse>Home(){

        ApiResponse response = new ApiResponse();
        response.setMassage("Welcome to ai chatbot");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
