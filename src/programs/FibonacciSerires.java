package programs;

public class FibonacciSerires {

	public static void main(String[] args) {

		int first = 0;
		int second = 1;
		int sum;

		for (int i = 2; i < 20; i++) {
			sum = first + second;
			System.out.print(" " + sum);
			first = second;
			second = sum;
			

		}

	}

}
