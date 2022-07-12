package programs;

public class MinimumandMaximumElementsinArrays {

	
	public static void main(String[] args) {
		int a[]= {50,60,30,40,};
		
		int max=a[0];//60
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Element in Arrayis "+max);
		
		
		int b[]= {50,100,40,20,60};
		int min=a[0];//50
		
		for(int i=1;i<b.length;i++)
		{
			if(b[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(" Minimum value in the Array is "+min);
	}
}
