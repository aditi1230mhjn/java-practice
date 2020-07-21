public class DelDuplicate
{
	public int[] deleteDuplicate(int[] arr)
	{	int n=arr.length;
		int k=0;
		for(int i=0;i<n;i++)
		{	boolean flag=false;
			for(int j=i+1;j<n;j++)
			{if(arr[i]==arr[j])
				{flag=true;n--;}
			if(flag==true)
			{arr[j]=arr[j+1];}
			}
		}
		System.out.println(n);
		int[] temp=new int[n];
		for(k=0;k<n;k++)
		{temp[k]=arr[k];}
		return temp;
	}
public static void main(String args[])
	{	int array[]={10,20,4,7,2,6,4,9,10,20,8,6};
		System.out.println("Original Array:");
		for(int i=0;i<array.length;i++)
		{System.out.print(" "+array[i]);}
		System.out.println("\n");
		DelDuplicate d=new DelDuplicate();
		int[] newArray=d.deleteDuplicate(array);
		System.out.println("Final Array:");
		for(int j=0;j<newArray.length;j++)
		{System.out.print(" "+newArray[j]);}
	}
}