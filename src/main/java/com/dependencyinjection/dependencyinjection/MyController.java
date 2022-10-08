package com.dependencyinjection.dependencyinjection;

import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {
        System.out.println("MyController() has been called!");
        this.myService = myService;
    }

    @GetMapping("/name")
    public String getName(){
        System.out.println("getName() has been called!");
        return myService.getName();
    }

    @GetMapping("/")
    public String welcomeMessage(){
        System.out.println("welcomeMessage() has been called");
        return "Welcome!";
    }

}
