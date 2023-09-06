package com.phplemos.apirest.Old;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String helloWorld(){
        return "This is my first API in Spring Boot";
    }

    @GetMapping("/person")
    public List<Person> consultAllPersons(){
        return repository.findAll();
    }

}
