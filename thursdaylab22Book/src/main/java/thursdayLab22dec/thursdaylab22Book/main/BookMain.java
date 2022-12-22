package thursdayLab22dec.thursdaylab22Book.main;

import java.sql.SQLException;

import thursdayLab22dec.BookDAOimpl.BookDAOimpl;
import thursdayLab22dec.thursdaylab22Book.entity.Book;
import thursdayLab22dec.thursdaylab22Bookdbconfig.DBConfig;

public class BookMain {
	public static void  main(String[] args) throws SQLException {
		BookDAOimpl dao=new BookDAOimpl();
		DBConfig.makeConnection();
		//dao.createTable();
		Book B1=new Book(4, 1000,"wings of fire");
		Book B2=new Book(5, 2000,"c language");
		Book B3=new Book(6, 3000,"python language");
		dao.insertBook(B1);
		dao.insertBook(B2);
		dao.insertBook(B3);
	
	}

}
