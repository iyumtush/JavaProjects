import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/students";
		String user = "root";
		String pass = "TushNIIT123#";

		
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url , user , pass);
	        System.out.println("Database connected successfully");
	        
	        Statement st = con.createStatement();
	        
	        String q = "create table if not exists "
	                + " employees("+" emp_no INT PRIMARY KEY,"
	                +"  emp_name varchar(100),"
	                +"  salary double )";
	        
	        st.executeUpdate(q);
	        System.out.println("Table created successfully");
	        
	        //Insert the data
	        
	        String insertQuery = "insert into employees "
	                + "(emp_no, emp_name, salary)"
	                + " values(?,?,?)";
	        
	        PreparedStatement pst = con.prepareStatement(insertQuery);
	        
	        pst.setInt(1, 111);
	        pst.setString(2, "Tushar");
	        pst.setDouble(3, 78000.95);
	        pst.executeUpdate();
	        
	        pst.setInt(1, 112);
	        pst.setString(2, "Soham");
	        pst.setDouble(3, 88000.95);
	        pst.executeUpdate();
	        
	        pst.setInt(1, 113);
	        pst.setString(2, "Gobi");
	        pst.setDouble(3, 500.95);
	        pst.executeUpdate();
	        
	        pst.setInt(1, 114);
	        pst.setString(2, "Rohan");
	        pst.setDouble(3, 8000.95);
	        pst.executeUpdate();
	        
	        
	        System.out.println("Record Inserted Successfully");
	        
	        con.close();
	        
	        
	        
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
