package com.darthcow.projects.spring.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    specifies the domain type is Employee and the id type is Long
}
