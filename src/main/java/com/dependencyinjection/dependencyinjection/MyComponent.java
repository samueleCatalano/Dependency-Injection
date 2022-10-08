package com.dependencyinjection.dependencyinjection;


import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    String myComponentName;


    public MyComponent() {
        System.out.println("MyComponent() has been called!");
        this.myComponentName = "Samuele";
    }

    public String getMyComponentName(){
        System.out.println("getMyComponentName() has been called!");
        return myComponentName;
    }

}
