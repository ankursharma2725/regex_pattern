package com.springboot.validation.regexpattern.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.validation.regexpattern.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
