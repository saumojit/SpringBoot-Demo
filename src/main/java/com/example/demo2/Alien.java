package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @ Component creates an object in IOC container within JVM
@Component
public class Alien {
    @Value("19")
    private int age ;
    // @Autowired helps dependency injection without Application Context from the main class
    // @Autowired - Commenting the field injection , Doing autowiring or setter injection Below
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
