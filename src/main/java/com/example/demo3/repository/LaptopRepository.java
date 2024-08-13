package com.example.demo3.repository;

import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public LaptopRepository() {
        System.out.println("LaptopRepository Created ...");
    }

    public void save(){
        System.out.println("Data saved to DB");
    }
}
