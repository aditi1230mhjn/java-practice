//main class of abstract method
import mysim.*;
public class CellPhone 
{
	public static void main(String args[])
	{
		AIRTEL a1=new AIRTEL();
		JIO j1=new JIO();
		a1.call();
		a1.message();
		j1.call();
		j1.message();
	}
}