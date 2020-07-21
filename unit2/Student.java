public class Student
{
	//data members

	private int rno;
	private String name;					//instance variables
	private int marks;
	private static int passed;
	private static int failed;				//class variables

	//methods
	public Student()					//constructor with zero arguments
	{	rno=marks=0;
		name="no name found";
	}
	
	public Student(int a,String b)				//constructor with two arguments
	{	rno=a;
		name=b;
		marks=0;
	}
	
	public Student(int a,String b,int c)			//constructor with three arguments
	{	rno=a;
		name=b;
		marks=c;
	}

	/*
	public void setData(int a,String b,int c)		//non-static method setter method
	{	rno=a;
		name=b;
		marks=c;
	}
	*/

	public void showData()					//non-static method
	{	System.out.println("Student Report:");
		System.out.println("Student Roll No.:"+rno);
		System.out.println("Student Name:"+name);
		System.out.println("Marks obtained out of 100:"+marks);
		showResult();
	}

	public void showResult()				//non-static method
	{	if(marks>33)
		{	passed++;
		System.out.println("You are passed.");
			if(marks>75 && marks<=100)
			{System.out.println("Grade:A+");}
			if(marks>50 && marks<=75)
			{System.out.println("Grade:B+");}
			if(marks>33 && marks<=50)
			{System.out.println("Grade:C+");}
		}
		else 
		{failed++;
		System.out.println("You are failed.");}
	}

	public static void finalResult()				//static method
	{	System.out.println("No. of Students passed:"+passed);
		System.out.println("No. of Students failed:"+failed);
	}
	
	public static void highestScore(Student...v)
	{	
		/*
		int max=0;			using for each loop
		for(Student s: v)
		{
			if(s.marks>max)
			{
			max=s.marks;
			}
		}
		System.out.println(max);
		*/

		int n=v.length;
		int rfmarks=v[0].marks;
		for(int i=0;i<n;i++)
		{	if(rfmarks<v[i].marks)
			{int temp=v[i].marks;
			v[i].marks=rfmarks;
			rfmarks=temp;}
		}
		System.out.println("Highest marks:"+rfmarks);
	}
}