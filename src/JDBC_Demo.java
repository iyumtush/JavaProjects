
//step 1 : Import java SQL package
import java.sql.*;
public class JDBC_Demo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String pass = "TushNIIT123#";
		String dbname = "students";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("Database Connection Successful");
			
			//Step :3 create the query / statements
			
			Statement st = con.createStatement();
			String q = "create database "+ dbname;
					
			//Step : 5 execute the statement
			st.executeUpdate(q);
			
			//Step : 6 Result
			
			System.out.println("Database created successfully : "+ dbname);
			
			//Step 7 : close the connection
			
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
