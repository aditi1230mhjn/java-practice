import java.io.*;
public class PlayGame
{	public static void main (String args[]) throws Exception
	{	String choice=new String(args[0]);
		int x=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		int z=Integer.parseInt(args[3]);

		/*catch(ArrayIndexOutOfBoundException a)
		{x=y=z=0;}*/
		ThreeDGame g=null;
		
		switch(choice)
		{	case "NEW":g=new ThreeDGame();
					break;
			case "RESUME":File f=new File("f:/JAVA/practice/lastgame.txt");
					if(f.exists())
					{	FileInputStream fis=new FileInputStream("lastgame.txt");
						ObjectInputStream ois=new ObjectInputStream(fis);
						g=(ThreeDGame)ois.readObject();
						ois.close();
						fis.close();
					}
					else
					{System.out.println("You need to play a new game first...:)");}
					break;

		default: System.out.println("Choose from NEW or RESUME Game...");
		}
		g.moveH(x);
		g.moveV(y);
		g.moveZ(z);
		g.showCurrentPosition();
		
		System.out.println("Saving the Game....");
		
		FileOutputStream fos=new FileOutputStream("lastgame.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(g);
		
		oos.close();
		fos.close();
		System.out.println("GameStored....!!!");
		System.out.println("BBYE!!!");
	}

}