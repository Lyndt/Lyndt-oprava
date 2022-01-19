package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong number = new AtomicLong(0);
    Greeting greetInAllLanguage = new Greeting();


    @RequestMapping(path = "/web/greeting")
    public String greeting(Model model) {
        Random randomHellos = new Random();
        String hellos = greetInAllLanguage.getHellos()[randomHellos.nextInt(greetInAllLanguage.getHellos().length)];
        number.getAndSet(number.get() + 1);
        model.addAttribute("name", " Linda");
        model.addAttribute("counter", greetInAllLanguage.fizzBuzz(number));
        model.addAttribute("hellos", hellos);
        return "greeting";
    }
}
