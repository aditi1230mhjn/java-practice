public class Test
{
	public static void  main(String args[])
	{
		//case-1 (types are same)
		int v1=5;
		double v2=2.5;

		//case-2(a) types are diff but no error
		//case of implicit conversion / automatic conversion
			
		double v3=25;
		long v4=2;

		//case-2(b) types are diff (possible loss of precision)
		//case of explicit conversion (forcefully)
		//convert it us?ing cast operator.

		//converting a double value to int
		int v5=(int)23.45;

		//converting a double value to float
		float v6=(float)44.56;

		//case-2(c) types are diff (incompatible types)
		//conversion is not possible
		//neither java will do it
		//nor you can do

		//double v7=(double)true;
		//boolean v8=1;
		

		//long v9=2.4f;

	}
}