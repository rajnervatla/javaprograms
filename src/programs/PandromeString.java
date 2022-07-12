package programs;

import java.util.Scanner;

public class PandromeString {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
		String str=sc.next();
		
		String orginal_str=str;
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);		}
	
		
		if(orginal_str.equals(rev))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("String is not palindrome ");
		}
	}
}
