package com.example.demo3.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @ Component creates an object in IOC container within JVM
@Component
public class Alien {
    @Value("19")
    private int age ;
    private Computer lap ;

    public Computer getLap() {
        return lap;
    }


    // @Qualifier("desktop") // we can use qualifier as well which has higher precedence than @Primary
    @Autowired  // setter injection
    public void setLap(Computer lap) {
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("coding ...");
        lap.compile();
    }
}
