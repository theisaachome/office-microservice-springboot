package com.isaachome.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaachome.department.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
