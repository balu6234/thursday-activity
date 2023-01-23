package com.librarymanagementsystem.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagementsystem.Entity.Book;
import com.librarymanagementsystem.Entity.Student;
import com.librarymanagementsystem.dto.BookDTO;
import com.librarymanagementsystem.repository.BookRepository;
import com.librarymanagementsystem.service.BookService;
@Service
public class BookServiceImpl implements BookService{
@Autowired
BookRepository bookrepository;

@Override
public Book saveBook(BookDTO bookDTO) {	
	Book book=Book.builder()
			.bookName(bookDTO.getBookName())
			.bookAuthor(bookDTO.getBookAuthor())
			.bookPrice(bookDTO.getBookPrice()).bookPublication(bookDTO.getBookPublication())
			.build();
	return bookrepository.save(book);
	
}
@Override
public Book updateBook(BookDTO bookDTO, int bookId) {
	Book book=Book.builder()
			.bookName(bookDTO.getBookName())
			.bookAuthor(bookDTO.getBookAuthor())
			.bookPrice(bookDTO.getBookPrice()).bookPublication(bookDTO.getBookPublication())
			.build();
	return bookrepository.save(book);
}

@Override
public Book deleteBook(int bookId) {
	bookrepository.findById(bookId).get();
	return null;
}

@Override
public Book getBookById(int bookId) {
	return bookrepository.findById(bookId).get();
}

}
