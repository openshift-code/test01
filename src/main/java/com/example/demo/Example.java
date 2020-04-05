package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;


@RestController
public class Example {

//    @PersistenceContext
//    private EntityManager manager;

    @PostConstruct
    public static void init() {
        System.out.println("Init started.");

    }

    @GetMapping("/tst")
    public String tst() {
        System.out.println("GET mapping");
        return LocalDateTime.now().toString();
    }
}
