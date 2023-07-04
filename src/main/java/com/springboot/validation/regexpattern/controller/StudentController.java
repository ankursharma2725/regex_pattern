package com.springboot.validation.regexpattern.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.validation.regexpattern.model.Student;
import com.springboot.validation.regexpattern.service.StudentService;

@RestController
@Validated
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addStudent(@Valid @RequestBody Student student){
		studentService.addStudent(student);
		return new ResponseEntity<String>("Student Added Successfully",HttpStatus.CREATED);
	}
	
}
