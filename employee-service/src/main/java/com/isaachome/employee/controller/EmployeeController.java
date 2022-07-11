package com.isaachome.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.isaachome.employee.entity.Employee;
import com.isaachome.employee.service.EmployeeService;
import com.isaachome.employee.vo.ResponseVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		return List.of();
	}
	
	@GetMapping("/{id}")
	public ResponseVO getEmployeWithDepartment(@PathVariable("id") long id) {
		return employeeService.getEmployeeWithDepartment(id);
	}
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
}
