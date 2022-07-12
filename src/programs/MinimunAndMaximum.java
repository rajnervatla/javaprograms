package programs;

public class MinimunAndMaximum {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 0, 10, 24, 7, 4, 9, 11 };

		int array_size = arr.length;
		System.out.println(array_size);

		for (int i = 0; i < array_size - 1; i++) {
			for (int j = 0; j < array_size - 1; i++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				System.out.print("Sorted array   " + arr[i]);

				// int mid = array_size / 2;

				// System.out.println("Max" + arr[array_size - 1] + "Min" + arr[0] + "mid");
			}

			System.out.print("Sorted array" + arr[i]);
		}

	}
}
