package programs;

import java.util.Arrays;
import java.util.Collections;

public class SortingElemts {

	public static void main(String[] args) {

		// Approach 1
		int a[] = { 30, 50, 20, 10, 60 };
		System.out.println("Array Elements before sorting :" + Arrays.toString(a));

		Arrays.parallelSort(a);
		System.out.println("Array Elements After sorting :" + Arrays.toString(a));

		// Approach 2
		System.out.println("Array Elements before sorting :" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array Elements After sorting :" + Arrays.toString(a));
		
		//Approach 3            descending order or reverse order
		Integer arr[] = { 30, 50, 20, 10, 60,75 };
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Array Elements After sorting :" + Arrays.toString(arr));
		
	}

}
