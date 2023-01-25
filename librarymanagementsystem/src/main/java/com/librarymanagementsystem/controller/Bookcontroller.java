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
import com.librarymanagementsystem.exception.BookNotFoundException;
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
	try{
	    Book book =bookservice.saveBook(bookDTO);
	    if(book!=null)
	    {
	        return new ResponseEntity<Book>(book,HttpStatus.CREATED);
	    }
	}
	catch(Exception ex)
	{
	    throw new BookNotFoundException("unable to add");
	}
	return new ResponseEntity<Book>(HttpStatus.BAD_REQUEST);
	}
	@GetMapping("/books/{bookId}") ResponseEntity<Book> getBookById(@PathVariable("bookId")int bookId)
    {
			try{
	    Book book =bookservice.getBookById(bookId);
	    if(book!=null){
	        return new ResponseEntity<Book>(book,HttpStatus.FOUND);
	    }
	}
	catch(Exception ex)
	{
	    throw new BookNotFoundException("NO BOOK FIND WITH ID"+bookId+"Found");
	}
	return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}
    
			
	@DeleteMapping("/delete/{bookId}")
	public ResponseEntity<String> deleteBookById(@PathVariable("bookId")int bookId)
	{
	try{
	    String book=bookservice.deleteBookById(bookId);
	    if(book!=null){
	        return new ResponseEntity<String>(book,HttpStatus.ACCEPTED);
	    }
	}
	catch(Exception ex)
	{
	    throw new BookNotFoundException("unable to delete");
	}
	return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
	}
		
	  @PutMapping("/book/update/{bookId}")
	 ResponseEntity<Book> UpdateBookById(@RequestBody BookDTO bookDTO,@PathVariable int bookId)
	{
		try{
	    Book book =bookservice.updateBook(bookDTO,bookId);
	    if(book!=null){
	        return new ResponseEntity<Book>(book,HttpStatus.ACCEPTED);
	    }
	}
	catch(Exception ex)
	{
	    throw new BookNotFoundException("unable to update");
	}
	return new ResponseEntity<Book>(HttpStatus.NOT_MODIFIED);
	}
	}
