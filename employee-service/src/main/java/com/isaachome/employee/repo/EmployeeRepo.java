package com.isaachome.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaachome.employee.entity.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Long>{

}
