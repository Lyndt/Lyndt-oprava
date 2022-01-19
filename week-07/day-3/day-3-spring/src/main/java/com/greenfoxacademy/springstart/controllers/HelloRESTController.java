package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong number = new AtomicLong(0);

    @RequestMapping(path = "/greeting")
    public Greeting greeting(@RequestParam String name) {
        number.getAndSet(number.get() + 1);
        Greeting greeting1 = new Greeting(number, "Hello " + name);
        return greeting1;

    }

}
