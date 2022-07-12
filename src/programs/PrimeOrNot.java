package programs;

public class PrimeOrNot {

	public static void main(String[] args) {

		
		//Natural number >1
		//which has only 2 factors 1 and itself
		//19=> 1,19 is prime number
		//28 => is not prime number bcz its having multiple factors 1,2,4,7,14,28
		int num = 5;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;

			}
			if(count==2)
			{
				System.out.println("Prime Number");
			}
			else 
			{
				System.out.println("Not Prime");
			}
		}
		

	}
}
