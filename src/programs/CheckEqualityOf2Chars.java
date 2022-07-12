package programs;

import java.util.Arrays;

public class CheckEqualityOf2Chars {

	public static void main(String[] args) {
		
		int a1[]= {1,5,2,6,8};
		int a2[]= {5,2,45,8,87};
		//boolean status=Arrays.equals(a1, a2);
	boolean status= true;
	if(a1.length==a2.length)
	{
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]!=a2[i])
			{
				status=false;
			}
		}
	}
	else
	{
		status=false;
	}
	if(status==true)
	{
		System.out.println("Arrays are equal");
	}
	else
	{
		System.out.println("Arrays are not equal");
	}
	}
}
