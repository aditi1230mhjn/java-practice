public class School
{	public static void main(String args[])
	{	Student[] s;				//type[] var;var=new type[size]
							//declaring of array of objects
		s=new Student[10];
							//type[] variable=new type[size](combination)

		s[0]=new Student(1,"AAA",95);			//object forming of constructors
		s[1]=new Student(1,"BBB",90);
		s[2]=new Student();				//no arguments
		s[3]=new Student(1,"DDD",32);
		s[4]=new Student(1,"EEE",33);
		s[5]=new Student(1,"FFF",23);
		s[6]=new Student(1,"GGG",80);
		s[7]=new Student(1,"HHH",75);
		s[8]=new Student(1,"III",90);
		s[9]=new Student(1,"JJJ");			//with only two arguments

		for(int i=0;i<10;i++)				//show data
		{s[i].showData();
		System.out.println("--------------------------------------------");}

		System.out.println("==============================================");

		Student.finalResult();				//total students passed or failed

		System.out.println("===============================================");

		
		Student.highestScore(s);			//highest marks
		System.out.println("===============================================");

	}
}