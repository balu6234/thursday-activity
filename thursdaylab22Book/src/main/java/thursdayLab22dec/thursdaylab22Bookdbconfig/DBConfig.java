package thursdayLab22dec.thursdaylab22Bookdbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {
 static
 {
	 try
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	 }
	 catch(ClassNotFoundException e)
	 {
		 System.out.println("couldnot able to load");
	 }
 }
 public static Connection makeConnection() throws SQLException  {
	 return DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb","root","Sathwik@123");
 }
}
