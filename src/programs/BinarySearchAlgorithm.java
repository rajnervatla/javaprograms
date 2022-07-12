
package programs;

import java.util.Arrays;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {

		//
		/*
		 * index a[0] a[1] a[2] a[3] a[4] a[5] a[6] a[7] a[8] a[9] For performing the
		 * binary search array should be in sorted order
		 */

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean flag = false;
		int key = 100;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				System.out.println("Element found ");
				flag = true;
				break;

			}

			if (arr[mid] < key) {
				low = mid + 1;

			}

			if (arr[mid] > key) {
				high = mid - 1;

			}
		}
		if (flag == false) {
			System.out.println("Element not found..");
		}

		// Approach 2 for binary sorting
		System.out.println(Arrays.binarySearch(arr, 5));
		
		System.out.println(" Ading it too thhe feature brancch");
		
	}

}
=======
package programs;

import java.util.Arrays;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {

		//
		/*
		 * index a[0] a[1] a[2] a[3] a[4] a[5] a[6] a[7] a[8] a[9] For performing the
		 * binary search array should be in sorted order
		 */

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean flag = false;
		int key = 100;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				System.out.println("Element found ");
				flag = true;
				break;

			}

			if (arr[mid] < key) {
				low = mid + 1;

			}

			if (arr[mid] > key) {
				high = mid - 1;

			}
		}
		if (flag == false) {
			System.out.println("Element not found..");
		}

		// Approach 2 for binary sorting
		System.out.println(Arrays.binarySearch(arr, 5));
	}

}

