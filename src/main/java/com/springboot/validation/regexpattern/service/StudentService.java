package com.springboot.validation.regexpattern.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.validation.regexpattern.model.Student;
import com.springboot.validation.regexpattern.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;

	public void addStudent(Student student) {
		repo.save(student);
	}

}
