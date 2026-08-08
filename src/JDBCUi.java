import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class JDBCUi extends JFrame implements ActionListener
{
    //GUI components
	
	JLabel l1,l2,l3;
	JTextField tf1,tf2,tf3;
	JButton b1 ,b2 ,b3 , b4;
	
	//JDBC components 
	
	Connection con;
	Statement st;
	ResultSet rs;
	
	JDBCUi()
	{	
		setLayout(null);
		l1 = new JLabel("Number");
		l2 = new JLabel("Name");
		l3 = new JLabel("Stipend");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		
	    b1 = new JButton("First");
	    b2 = new JButton("Next");
	    b3 = new JButton("Prev");
		b4 = new JButton("Last");
		
		//This is the GUI part of the code where we are creating the labels, 
		// text fields and buttons and adding them to the frame. We are also setting 
		// the bounds for each component and adding action listeners to the buttons.	
		
		l1.setBounds(100, 100, 100, 30);
		add(l1);
		
		tf1.setBounds(220, 100, 100, 30);
		add(tf1);
		
		l2.setBounds(100, 140, 100, 30);
		add(l2);
		
		tf2.setBounds(220, 140, 100, 30);
		add(tf2);
		
		l3.setBounds(100, 180, 100, 30);
		add(l3);
		
		tf3.setBounds(220, 180, 100, 30);
		add(tf3);
		
		b1.setBounds(100, 220, 100, 30);
		add(b1);
		b2.setBounds(220, 220, 100, 30);
		add(b2);
		b3.setBounds(100, 260, 100, 30);
		add(b3);
		b4.setBounds(220, 260, 100, 30);
		add(b4);
		
		
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        //JDBC connections 
        
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students",
        			"root","TushNIIT123#");
        	
        	
        	st = con.createStatement(
        			ResultSet.TYPE_SCROLL_INSENSITIVE,
        			ResultSet.CONCUR_READ_ONLY);
        	
        	rs = st.executeQuery("select * from employees");
        	
        	if(rs.next()) 
        	{
        		tf1.setText(rs.getString(1));
        		tf2.setText(rs.getString(2));
        		tf3.setText(rs.getString(3));

        	}
        }catch(Exception e) 
        {
        	e.printStackTrace();
        }	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		try 
		{
			JButton b = (JButton)ae.getSource();
			
			if(b == b1) 
			{
				rs.first();			
				
			} 
			else if (b == b2) 
			{
				if(!rs.isLast()) 
				{
					rs.next();				
					
				} 
			else if (b == b3) 
				{
					if(!rs.isFirst()) 
					{
						rs.previous();
					} 
				}
				else if (b== b4)
				{
						
						rs.isLast();
					}
						
					tf1.setText(rs.getString(1));
					tf2.setText(rs.getString(2));
					tf3.setText(rs.getString(3));

				

			}
			
			
					
		} catch(Exception e) 
		{
			e.printStackTrace();
		}

	}
	public static void main(String[] args) 
	
	{

		JDBCUi u = new JDBCUi();
		u.setSize(600,600);
		u.setVisible(true);
		u.addWindowListener(new WindowAdapter()
	    {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}

}
