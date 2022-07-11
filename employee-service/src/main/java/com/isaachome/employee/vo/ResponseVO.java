package com.isaachome.employee.vo;

import com.isaachome.employee.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVO {

	private Employee employee;
	private Department department;
}
