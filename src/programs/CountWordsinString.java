package programs;

import java.util.Scanner;

public class CountWordsinString {

	public static void main(String[] args) {
		System.out.println("Enter a string");

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();// Welcome to java
		int count = 1;

		for (int i = 0; i < s.length() - 1; i++)// iterate all the words from string
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		
		System.out.println("Number of word in string ::"+count);

	}
}
