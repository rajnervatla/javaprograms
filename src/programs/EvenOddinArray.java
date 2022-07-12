package programs;

public class EvenOddinArray {

	public static void main(String[] args) {
		
		int a[]= {1,3,4,5,67,8};
		
		
		System.out.println("Print the Even numbers in array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print("Even Numbers :"+a[i]);
			}
		}
		System.out.println("Print the Odd numbers in array");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(" "+a[i]);
			}
		}
		
		
		//Enhanced for loop
		
		for( int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		
		
	}
	}
	
