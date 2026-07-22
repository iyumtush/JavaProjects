import java.awt.*;
public class DemoUi extends Frame {
	
	DemoUi(){
		Button b = new Button("Click");
		b.setBounds(100,100,80,30);
		add(b);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DemoUi();
		

	}

}
