package Arrays;

import java.util.Arrays;

public class SortingTheStringArray {
	 public static void main(String args[]) {
		    String arr[] = { "Python", "JavaScript", "Ruby", "C++", "HTML" };
		    System.out.println("Before sorting:\n" + Arrays.toString(arr));
		    Arrays.sort(arr);
		    System.out.println("\n");
		    System.out.println("After sorting:\n" + Arrays.toString(arr));
		  }

}
