package com.employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Create;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins="http://localhost:8011", maxAge=3600)
public class RestControllerApplication 
{
	@Autowired
	EmployeeService empService;
	
	
	@GetMapping(value="/findById/{empId}")
	public ResponseEntity<Optional<Create>> findEmployee(@PathVariable Integer empId) {
		Optional<Create> employee=empService.findEmployee(empId);
		
		ResponseEntity<Optional<Create>> Response=new ResponseEntity<>(employee,HttpStatus.OK);
		return Response;
	}
	
}