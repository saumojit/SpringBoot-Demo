package com.example.demo;

import org.springframework.stereotype.Component;

// @ Component creates an object in IOC container within JVM
@Component
public class Laptop {
    public void compile(){
        System.out.println("Compiling ...");
    }
}
