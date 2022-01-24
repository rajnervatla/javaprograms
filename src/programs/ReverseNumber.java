package programs;

import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int num=sc.nextInt();
		int reverse=0;
	/*logic 1*/	
	
/*		while(num!=0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse Number is "+reverse);
	}
*/
	
		
		/*Logic 2**/
		/*
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		*/
		
		
		/**Logic 3**/
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println(rev);
		
		
	}
	
	
}
