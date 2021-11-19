package com.example.SpringsecurityOauth2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("restricted")
public class RestrictedController {
    @GetMapping
    public ResponseEntity<String> restricted(){
        return new ResponseEntity<String>("You have been logged in successfully", HttpStatus.OK);
    }

    @GetMapping("user")
    public Principal user(Principal principal){
        return principal;
    }
}
