package com.isaachome.department.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isaachome.department.entity.Department;
import com.isaachome.department.repo.DepartmentRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class DepartmentService {

	private final DepartmentRepo departmentRepo;
	
	public List<Department> findAll(){
		return departmentRepo.findAll();
	}
	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of Department Service.");
		return departmentRepo.save(department);
	}
	public Department findDepartmentById(long id) {
		log.info("Inside findDepartmentById method of Department Service.");
		return departmentRepo.findById(id).orElseThrow(()-> new IllegalStateException("Something went wrong."));
	}
}
