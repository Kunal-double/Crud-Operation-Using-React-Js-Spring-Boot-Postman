package com.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaguides.springboot.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
}
