package programs;

public class MaxNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 23, 45, 2, 3, 12, 0, 12, 3 };
		findMinMax(arr);
	}

	private static void findMinMax(int[] arr) {
		int max = arr[0];
		int min = arr[0];
	

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min)

			{
				min = arr[i];
			}
		}
		System.out.println("Minimum element in array"+min);
		System.out.println("Maximum element in array"+max);
		

	}

}
