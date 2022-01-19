package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class UserController {
    @GetMapping("/users")
    @ResponseBody
    public String show(@PathVariable String id){
        return id;
    }
}
