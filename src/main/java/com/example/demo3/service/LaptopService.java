package com.example.demo3.service;
import com.example.demo3.model.Laptop;
import com.example.demo3.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    public LaptopRepository repo;
    public LaptopService(){
        System.out.println("LaptopService Created ...");
    }

    public void addLaptop(Laptop lap){
        repo.save();
        System.out.println("Laptop Added");
    }
}
