package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.services.Services;

@RestController
@RequestMapping("emp")
public class Controller {
	
	@Autowired
	Services service;
	
	@PostMapping("/add")
	public String insertEmp(@RequestBody Employee emp) {
		return service.addEmp(emp);
	}
	@PutMapping("/update")
	public String updateEmp(@RequestBody Employee emp) {
		return service.updateEmp(emp);
	}
	@DeleteMapping("/delete/{eid}")
	public String deleteEmp(@PathVariable("eid")int empId) {
		return service.deleteEmp(empId);
	}
	@GetMapping("/get/{eid}")
	public Employee getEmployee(@PathVariable("eid") int empId) {
		return service.getEmp(empId);
	}

}
