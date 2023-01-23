package com.librarymanagementsystem.serviceimpl;

import java.util.ArrayList;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagementsystem.Entity.Book;
import com.librarymanagementsystem.Entity.Student;
import com.librarymanagementsystem.dto.StudentDTO;
import com.librarymanagementsystem.repository.StudentRepository;
import com.librarymanagementsystem.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
 
	public Student saveStudent(StudentDTO studentDTO) {
	 Student student=Student.builder().studentName(studentDTO.getStudentName()).book(studentDTO.getBook())
			 .studentAddress(studentDTO.getStudentAddress())
			 .build();
		return studentRepository.save(student);
	}


	public Student updateStudent(StudentDTO studentDTO, int studentId) {
		
	Student student=studentRepository.findById(studentId).get();
	Student student1=Student.builder().studentName(studentDTO.getStudentName()).book(studentDTO.getBook())
			 .studentAddress(studentDTO.getStudentAddress())
			 .build();
		return studentRepository.save(student1);
	}

	@Override
	public Student getStudentById(int studentId) {
		return studentRepository.findById(studentId).get();
	}

	@Override
	public Student deleteStudent(int studentId) {
		 studentRepository.deleteById(studentId);
		 return null;
	}

	
}
