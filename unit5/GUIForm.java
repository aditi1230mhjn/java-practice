import java.awt.*;
public class GUIForm
{	public static void main(String args[])
	{	Frame f=new Frame();
		f.setVisible(true);
		f.setSize(400,400);
		
		Label l1=new Label("Name:");
		Label l2=new Label("ID No.:");
		Label l3=new Label("Contact No.:");
		Label l4=new Label("Email ID:");
		
		TextField t1=new TextField(15);
		TextField t2=new TextField(4);
		TextField t3=new TextField(13);
		TextField t4=new TextField(20);
		
		Button b1=new Button("Submit");
		f.setLayout(new GridLayout(5,2));
		f.add(l1);f.add(t1);
		f.add(l2);f.add(t2);
		f.add(l3);f.add(t3);
		f.add(l4);f.add(t4);
		f.add(b1);
	}
}