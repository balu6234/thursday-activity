package com.librarymanagementsystem.service;

import com.librarymanagementsystem.Entity.Book;
import com.librarymanagementsystem.dto.BookDTO;

public interface BookService {
  Book saveBook(BookDTO bookDTO);
  Book updateBook(BookDTO bookDTO, int bookId);
  Book deleteBook(int bookId);
  Book getBookById(int bookId);
}
