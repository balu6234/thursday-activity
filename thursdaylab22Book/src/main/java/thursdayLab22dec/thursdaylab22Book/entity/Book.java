package thursdayLab22dec.thursdaylab22Book.entity;

public class Book {
	int BookId;
	int Bookprice;
	String BookName;
	public int getBookId() {
		return BookId;
	}
	public double getBookprice() {
		return Bookprice;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public void setBookprice(int bookprice) {
		Bookprice = bookprice;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public Book(int bookId, int bookprice, String bookName) {
		super();
		BookId = bookId;
		Bookprice = bookprice;
		BookName = bookName;
	}
	

}
