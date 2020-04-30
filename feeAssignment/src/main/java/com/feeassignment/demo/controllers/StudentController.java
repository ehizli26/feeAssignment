package com.feeassignment.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feeassignment.demo.Entitiy.Student;
import com.feeassignment.demo.repositories.StudentDto;
import com.feeassignment.demo.services.Student_Service;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	  @Autowired
	    private Student_Service student_Service;

	    @GetMapping("/{studentId}")
	    public Student getStudent(Long studentId) {

	        return student_Service.findById(studentId);
	    }

	    @PutMapping("/{sId}")
	    public Student updateStudent(@PathVariable("sId") Long studentId, @RequestBody StudentDto studentDto ) {

	        return student_Service.updateStudent(studentId, studentDto);
	    }

}
