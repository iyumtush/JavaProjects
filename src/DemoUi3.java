import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DemoUi3 extends JFrame implements ActionListener
{
	JFrame jf;//global declaration
	JPanel pp;
	CardLayout cd;

	 DemoUi3()
	 {
		 jf = new JFrame();
		 cd = new CardLayout();
		 
		 /*Creating a main parent panel that will contain
		 two child panels*/
		 pp = new JPanel();
		 
		 //Creating two child panel 
		 JPanel cp1 = new JPanel();
		 JPanel cp2 = new JPanel();
		 
		 //Creating two parents button
		 JButton b1 = new JButton("Numbers");
		 JButton b2 = new JButton("Alphabets");

		 
		 //Creating three child buttons for numbers
		 JButton cb1 = new JButton("1");
		 JButton cb2 = new JButton("2");
		 JButton cb3 = new JButton("3");
		//Creating three child buttons for alphabets
		 JButton cb4 = new JButton("A");
		 JButton cb5 = new JButton("B");
		 JButton cb6 = new JButton("C");
		 
		 
		 //Adding cb1 ,cb2, cb3 buttons in Child panel cp1
		 
		 cp1.add(cb1);
		 cp1.add(cb2);
		 cp1.add(cb3);

        //Adding cb4 ,cb5, cb6 buttons in Child panel cp2
		 
		 cp2.add(cb4);
		 cp2.add(cb5);
		 cp2.add(cb6);

		 //Setting the positioning of the components of 
		 //In Parent Panel PP (That contains cp1 and cp2) to CardLayout.
		 
		 pp.setLayout(cd);
		 
		 //Adding cp1 and cp2 in Parent Panel PP
		 
		 pp.add(cp1, "Numbers");
		 pp.add(cp2, "Alphabets");

		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 
		 //Setting container JFrame's Layout to FlowLayout
		 
		 jf.setLayout(new FlowLayout());
		 
		 //
		 
		 jf.add(b1);
		 jf.add(b2);
		 
		 jf.add(pp);
		 
		 jf.setSize(300,200);
		 jf.setVisible(true);

		 
	 }
	 
	 public void actionPerformed(ActionEvent ae)
	 {
		if(ae.getActionCommand() == "Numbers") 
		{
			cd.show(pp,"Numbers");
		}else 
		{
			cd.show(pp,"Alphabets");
		}
	 }
	public static void main(String[] args) 
	{

		new DemoUi3();
		
	}
	

}
