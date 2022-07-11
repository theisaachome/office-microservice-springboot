package com.isaachome.department.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isaachome.department.entity.Department;
import com.isaachome.department.service.DepartmentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RequiredArgsConstructor
@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	private final DepartmentService service;
	
	@PostMapping
	public Department saveDeparment (@RequestBody Department department) {
		log.info("Inside saveDeparment method of DepartmentController.");
		return service.saveDepartment(department);
	}
	
	@GetMapping
	public List<Department> getAllDepartments(){
		log.info("Inside getAllDepartments method of DepartmentController.");
		return service.findAll();
	}
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") long id) {
		log.info("Inside saveDeparment method of DepartmentController.");
		return service.findDepartmentById(id);
	}
}
