package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Create;
import com.employee.service.EmployeeService;

@RestController

@RequestMapping("/fetch")
@CrossOrigin(origins="http://localhost:4012", maxAge=3600)
public class RestControllerApplication 
{
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/list")
	public List<Create> findAllEmployees() {
		return empService.findAllEmployees();
	}
}