public class ThreeDGame implements java.io.Serializable
{	private int xPos;
	private int yPos;
	private int zPos;
	
	public void moveH(int points)
	{xPos=xPos+points;}
	public void moveV(int points)
	{yPos=yPos+points;}
	public void moveZ(int points)
	{zPos=zPos+points;}
	
	public void showCurrentPosition()
	{System.out.println("Current Position("+xPos+","+yPos+","+zPos+")");}
}