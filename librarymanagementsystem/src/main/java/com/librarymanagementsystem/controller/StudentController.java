package com.librarymanagementsystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagementsystem.Entity.Book;
import com.librarymanagementsystem.Entity.Student;
import com.librarymanagementsystem.dto.BookDTO;
import com.librarymanagementsystem.dto.StudentDTO;
import com.librarymanagementsystem.exception.StudentNotFound;
import com.librarymanagementsystem.serviceimpl.BookServiceImpl;
import com.librarymanagementsystem.serviceimpl.StudentServiceimpl;
@RestController
public class StudentController {
	@Autowired
	StudentServiceimpl studentserviceimpl;
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody @Valid StudentDTO studentDTO)
	{
		
		 return new ResponseEntity<>(studentserviceimpl.saveStudent(studentDTO),HttpStatus.CREATED);

	}

	@GetMapping("/students/{studentId}")
	public ResponseEntity<Student> getStudentById(@PathVariable("studentId")int studentId)
	{
				return new ResponseEntity<>(studentserviceimpl.getStudentById(studentId),HttpStatus.FOUND);
    }
	
	@DeleteMapping("/student/delete/{studentId}")
	public ResponseEntity<Student> deleteStudentById(@PathVariable("studentId")int studentId)
	{
				return new ResponseEntity<>(studentserviceimpl.getStudentById(studentId),HttpStatus.FOUND);
	}
		    
	

	  @PutMapping("/student/update/{studentId}")
	 ResponseEntity<Student> UpdateStudentById(@RequestBody StudentDTO studentDTO,@PathVariable int studentId)
	{
				return new ResponseEntity<>(studentserviceimpl.getStudentById(studentId),HttpStatus.FOUND);
	}
			
}
