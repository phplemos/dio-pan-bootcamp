package com.phplemos.apirest.ApiRest;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDB {

    @Bean
    CommandLineRunner applicationRunner(EmployeeRepository repository){
        return args -> {
            repository.save(new Employee("Maria","Engenheiroa","Rua dos bobos"));
            repository.save(new Employee("Joao","Pedreiro","Rua dos bobos"));
        };
    }
}
