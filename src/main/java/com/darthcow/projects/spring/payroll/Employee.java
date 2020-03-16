package com.darthcow.projects.spring.payroll;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data // Lombok annotation to create getters, setters, equals, hash, toString methods
@Entity // JPA annotation to make instances of this class ready for storage in JPA
public class Employee {

    private @Id/* indicates it's primary key*/
    @GeneratedValue /* Automatically populate JPA provider */ Long id;
    private String name;
    private String role;


    public Employee() {
    }

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
}

