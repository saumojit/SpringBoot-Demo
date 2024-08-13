package com.example.demo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @ Component creates an object in IOC container within JVM


@Component
@Primary
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compiling with Laptop...");
    }
}
