package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @ Component creates an object in IOC container within JVM
@Component
public class Alien {

    // @Autowired helps dependency injection without Application Context from the main class
    @Autowired
    Laptop lap ;

    public void code(){
        System.out.println("coding ...");
        lap.compile();
    }
}
