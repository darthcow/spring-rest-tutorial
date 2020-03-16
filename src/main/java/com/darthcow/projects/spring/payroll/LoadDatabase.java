package com.darthcow.projects.spring.payroll;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Tells that the specified class has bean methods so it defines bean definition
@Slf4j // Lombok annotation to generate logger
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Employee 1", "Software Engineer")));
            log.info("Preloading " + repository.save(new Employee("Employee 2", "Data Scientist")));
        };
    }
}
