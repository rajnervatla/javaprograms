package programs;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {

	
	public static void main(String[] args) {
		
		//Approach Random class
		
		Random ran=new Random();
		int random=ran.nextInt(999);
		
		System.out.println(random);
		
	}
}
