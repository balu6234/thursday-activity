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
import com.librarymanagementsystem.exception.StudentNotFound;
import com.librarymanagementsystem.serviceimpl.BookServiceImpl;
import com.librarymanagementsystem.serviceimpl.StudentServiceimpl;
@RestController
public class Bookcontroller {
	@Autowired
	BookServiceImpl bookservice;
	@PostMapping("/book")
	public ResponseEntity<Book> addBook(@RequestBody @Valid BookDTO bookDTO)
	{
	 return new ResponseEntity<>(bookservice.saveBook(bookDTO),HttpStatus.CREATED);
	}
	@GetMapping("/books/{bookId}")
	public ResponseEntity<Book> getBookById(@PathVariable("bookId")int bookId)
    {
				return new ResponseEntity<>(bookservice.getBookById(bookId),HttpStatus.FOUND);
    }
			
	@DeleteMapping("/books/delete/{bookId}")
	public ResponseEntity<Book> deleteBookById(@PathVariable("bookId")int bookId)
	{
		return new ResponseEntity<>(bookservice.deleteBook(bookId),HttpStatus.FOUND);
	}	
	  @PutMapping("/book/update/{bookId}")
	 ResponseEntity<Book> UpdateStudentById(@RequestBody BookDTO bookDTO,@PathVariable int bookId)
	{
		return new ResponseEntity<>(bookservice.updateBook(bookDTO, bookId),HttpStatus.CREATED);
	}
}
