package com.librarymanagementsystem.service;

import com.librarymanagementsystem.Entity.Student;
import com.librarymanagementsystem.dto.StudentDTO; 

public interface StudentService {
   Student saveStudent(StudentDTO studentDTO);
   Student updateStudent(StudentDTO studentDTO,int id);
   Student getStudentById(int id);
   String deleteStudent(int id);
}
