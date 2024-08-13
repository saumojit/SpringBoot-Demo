package com.example.demo3.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @ Component creates an object in IOC container within JVM


@Component
@Primary
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Object Created ...");
    }

    public void compile(){
        System.out.println("Compiling with Laptop...");
    }
}
