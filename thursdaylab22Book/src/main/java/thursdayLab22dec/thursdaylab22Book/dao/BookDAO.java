package thursdayLab22dec.thursdaylab22Book.dao;

import java.util.List;

import thursdayLab22dec.thursdaylab22Book.entity.Book;

public interface BookDAO {
	void createTable();
	public boolean insertBook(Book B);
	//List<Book> getAllBooks();
    //void deleteBook();
	
}
