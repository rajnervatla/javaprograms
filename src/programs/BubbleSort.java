package programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 3, 56, 78 };
		System.out.println("Arrays Values before sorting  " + Arrays.toString(arr));
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		System.out.println("Arrays Values after sorting  " + Arrays.toString(arr));

	}
}
