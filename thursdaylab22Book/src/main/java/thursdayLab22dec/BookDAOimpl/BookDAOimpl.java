package thursdayLab22dec.BookDAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import thursdayLab22dec.thursdaylab22Book.dao.BookDAO;
import thursdayLab22dec.thursdaylab22Book.entity.Book;
import thursdayLab22dec.thursdaylab22Bookdbconfig.DBConfig;

public class BookDAOimpl implements BookDAO {

	static Connection con;
	  static Statement s;
	  static
	  {
		  try {
			  con=DBConfig.makeConnection();
					  
		  }
		  catch(SQLException e) {
			  System.out.println(e);
		  }
	  }
	  public void createTable()
	  {
		  try
		  {
			  Statement st=con.createStatement();
			  if(st.executeUpdate("create table Book(Book_Name varchar(100),Book_Id int primary key,Book_price double)")==0);
			      System.out.println("table is successfully created");
		 
		  }
		  catch(SQLException e)
		  {
			  System.out.println(e);
		  }
	  }

	  
	public boolean insertBook(Book B) {
		boolean b=false;
		  try
		  {
			  PreparedStatement pst=con.prepareStatement("insert into Book values(?,?,?)");
			 pst.setString(1,B.getBookName());
			 pst.setInt(2,B.getBookId());
			 pst.setDouble(3, B.getBookprice());
			int rowsAffected= pst.executeUpdate();
			if(rowsAffected>0)
			{
				b=false;
				con.commit();
			}
			else
			{
				b=true;
			}
		  }
		  catch(SQLException e)
		  {
			  System.out.println(e);
		  }
		 	return b;
	
	}

}
