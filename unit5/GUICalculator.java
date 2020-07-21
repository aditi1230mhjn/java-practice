import java.awt.*;
import java.awt.event.*;
public class GUICalculator implements ActionListener
{		Label l1=new Label("Fisrt No.:");
		Label l2=new Label("Second No.:");
		Label l3=new Label("Result:");
		TextField t1=new TextField("5");
		TextField t2=new TextField("5");
		TextField t3=new TextField("5");
		Button b1=new Button("+");
		Button b2=new Button("-");
		Button b3=new Button("*");
		Button b4=new Button("/");
	public GUICalculator()
	{initComponents();}
	public void actionPerformed(ActionEvent ae)
	{	if(ae.getSource()==b1)
		{	String s1=t1.getText();
			String s2=t2.getText();
			Integer x=Integer.valueOf(s1);
			Integer y=Integer.valueOf(s2);
			Integer z=x+y;
			String s=String.valueOf(z);
			t3.setText(s);}
		if(ae.getSource()==b2)
		{	String s1=t1.getText();
			String s2=t2.getText();
			Integer x=Integer.valueOf(s1);
			Integer y=Integer.valueOf(s2);
			Integer z=x-y;
			String s=String.valueOf(z);
			t3.setText(s);}
		
		if(ae.getSource()==b3)
		{	String s1=t1.getText();
			String s2=t2.getText();
			Integer x=Integer.valueOf(s1);
			Integer y=Integer.valueOf(s2);
			Integer z=x*y;
			String s=String.valueOf(z);
			t3.setText(s);}
		
		if(ae.getSource()==b4)
		{	String s1=t1.getText();
			String s2=t2.getText();
			Integer x=Integer.valueOf(s1);
			Integer y=Integer.valueOf(s2);
			Integer z=x/y;
			String s=String.valueOf(z);
			t3.setText(s);}
				
	}
	public void initComponents()
	{	Frame f=new Frame();
		f.setVisible(true);
		f.setSize(400,600);
		f.setLayout(new GridLayout(5,2));
		
		f.add(l1);f.add(t1);
		f.add(l2);f.add(t2);
		f.add(l3);f.add(t3);
		f.add(b1);f.add(b2);
		f.add(b3);f.add(b4);	
		b1.addActionListener(this);//register
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}	
	public static void main(String args[])
	{GUICalculator c=new GUICalculator();}
}