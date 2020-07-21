class StringArray
{	public static void main(String args[])
{	//String strarr[]={"indore","bhopal","delhi","agra","chennai","goa"};

	String strarr[];			//declaration
	strarr=new String[6];

	strarr[0]=new String("indore");
	strarr[1]=new String("bhopal");
	strarr[2]=new String("delhi");
	strarr[3]=new String("amritsar");
	strarr[4]=new String("chennai");
	strarr[5]=new String("goa");
	
	String newarr[];
	newarr=new String[6];
	
	String tmp=new String();
	int n,i=0;
	
	//for sorting
	for(i=0;i<6;i++)
	{	for(int j=i+1;j<6;j++)
	{	n=strarr[i].compareTo(strarr[j]);
		if(n>0)
		{
		String temp=strarr[i];			//swapping
		strarr[i]=strarr[j];
		strarr[j]=temp;
		}
	}
	newarr[i]=strarr[i];			//storing in a new array
	}
	
	for(i=0;i<6;i++)
	{System.out.println(newarr[i]);}
}
}