package com.isaachome.employee.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.isaachome.employee.entity.Employee;
import com.isaachome.employee.repo.EmployeeRepo;
import com.isaachome.employee.vo.Department;
import com.isaachome.employee.vo.ResponseVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeService {

	private final EmployeeRepo employeeRepo;
	private final RestTemplate restTemplate; 
	
	public Employee saveEmployee(Employee employee) {
		log.info("Inside saveEmployee method of EmployeeService.");
		return employeeRepo.save(employee);
	}
	
	public ResponseVO getEmployeeWithDepartment(long id) {
		log.info("Inside getEmployeeWithDepartment method of EmployeeService.");
		
		ResponseVO vo = new ResponseVO();
		Employee emp =  employeeRepo.findById(id).get();
		Department department = restTemplate.getForObject(
				"http://localhost:9001/departments/" + emp.getDepartmentId(), 
				Department.class);
		vo.setEmployee(emp);
		vo.setDepartment(department);
		
		return vo;
	}
	
}
