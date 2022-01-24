package programs;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int num=sc.nextInt();
		
		int original_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(original_num==rev)
		{
			System.out.println("Given Number is palindrome");
		}
		else 
		{
			System.out.println("Its  not palindrome");
		}
	}
	}
	
