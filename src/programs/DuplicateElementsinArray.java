package programs;

import java.util.HashSet;

public class DuplicateElementsinArray {

	public static void main(String[] args) {

		//String arr[] = { "java", "c", "c++", "python" };
		int arr[] = { 1,3,4,5,7,8,8,9,0 };
		// Logic 1 by comparing the elements

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Found Duplicate Element is " + arr[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Duplicate element is not found");
		}

		// Approach 2 by using Hashset

		String arr2[] = { "Raj", "prince", "java", "java" };
		HashSet<String> langs = new HashSet<String>();
		for (String str : arr2) {
			if (langs.add(str) == false) {
				System.out.println("Found Duplicate Elements" + str);
				flag = true;
			}

		}

	}

}
