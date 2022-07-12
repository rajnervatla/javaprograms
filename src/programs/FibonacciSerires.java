package programs;

public class FibonacciSerires {

	public static void main(String[] args) {

		int first = 0;
		int second = 1;
		int sum=0;

		for (int i = 2; i < 20; i++) {
			
			
			first = second;
			second = sum;
			sum = first + second;
			System.out.print(" " + sum);
			

		}

	}

}
