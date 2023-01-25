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
import com.librarymanagementsystem.exception.BookNotFoundException;
import com.librarymanagementsystem.exception.StudentNotFound;
import com.librarymanagementsystem.serviceimpl.BookServiceImpl;
import com.librarymanagementsystem.serviceimpl.StudentServiceimpl;
@RestController
public class StudentController {
	@Autowired
	StudentServiceimpl studentserviceimpl;
	@PostMapping("/student")
	public ResponseEntity<Student>saveStudent(@RequestBody @Valid StudentDTO studentDTO)
	{
	try{
	    Student student =studentserviceimpl.saveStudent(studentDTO);
	    if(student!=null)
	    {
	        return new ResponseEntity<Student>(student,HttpStatus.CREATED);
	    }
	}
	catch(Exception ex)
	{
	    throw new StudentNotFound("unable to add");
	}
	return new ResponseEntity<Student>(HttpStatus.BAD_REQUEST);
	}
	@GetMapping("/students/{studentId}") ResponseEntity<Student> getStudentById(@PathVariable("studentId")int studentId)
    {
			try{
	    Student student =studentserviceimpl.getStudentById(studentId);
	    if(student!=null){
	        return new ResponseEntity<Student>(student,HttpStatus.FOUND);
	    }
	}
	catch(Exception ex)
	{
	    throw new StudentNotFound("NO BOOK FIND WITH ID"+studentId+"Found");
	}
	return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
    
			
	@DeleteMapping("/student/delete/{studentId}")
	public ResponseEntity<String> deleteStudentById(@PathVariable("studentId")int studentId)
	{
	try{
	    String student=studentserviceimpl.deleteStudent(studentId);
	    if(student!=null){
	        return new ResponseEntity<String>(student,HttpStatus.ACCEPTED);
	    }
	}
	catch(Exception ex)
	{
	    throw new StudentNotFound("unable to delete");
	}
	return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
	}
		
	  @PutMapping("/student/update/{studentId}")
	 ResponseEntity<Student> UpdateStudentById(@RequestBody StudentDTO studentDTO,@PathVariable int studentId)
	{
		try{
	    Student student=studentserviceimpl.updateStudent(studentDTO, studentId);
	    if(student!=null){
	        return new ResponseEntity<Student>(student,HttpStatus.ACCEPTED);
	    }
	}
	catch(Exception ex)
	{
	    throw new StudentNotFound("unable to update");
	}
	return new ResponseEntity<Student>(HttpStatus.NOT_MODIFIED);
	}
	}
