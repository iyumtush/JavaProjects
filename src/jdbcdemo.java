//Import java.sql package

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcdemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Step 1 : Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 : Establish the connection
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATM_DB", "root" ,"TushNIIT123#");
		System.out.println("Connection Successful..");
		
	}

}
