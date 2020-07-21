class PositionOfChar
{		public static void checkIndex(String str,char ch)	//static method
		{		
		int occurence=0;

		System.out.println("Positons of "+ch+" are:");
		
		for(int j=str.length();j>=0;j--)
		{	int position=str.indexOf(ch,j);
			if(position==j)
			{occurence++;
			System.out.println(position);
			}
		}
		System.out.println("-------------------------------------------");
		System.out.println("No. of times:"+occurence);
		}

			public static void main(String args[])
			{	String s=("this is java and java is a powerful language");
				PositionOfChar.checkIndex(s,'i');
				PositionOfChar.checkIndex(s,'a');  //calling
			}
}