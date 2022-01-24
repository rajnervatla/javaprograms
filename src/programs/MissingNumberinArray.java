package programs;

public class MissingNumberinArray {
	public static void main(String[] args) {

		// Array should not have duplicates
		// Array no need to be sorted order
		// values should be in range

		int a[] = { 1, 3, 4, 5 };

		// logic
		// 1+3+4+5 sum1
		// 1+2+3+4+5=15 sum2
		// missing number is sum2-sum1 we will get missing number

		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of elements in array" + sum1);
		int sum2 = 0;

		for (int i = 1; i <= 4; i++) {
			sum2 = sum1 + i;
		}
		System.out.println("Sum of Range of elements " + sum2);

	}

}
