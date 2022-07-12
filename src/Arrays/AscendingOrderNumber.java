package Arrays;

import java.util.Arrays;

public class AscendingOrderNumber {

	public static void main(String args[]) {
	    int[] exmp = {281, 59, 358, 81, 34, 985, 736 };
	    System.out.println("Before sorting:\n" + Arrays.toString(exmp));
	    Arrays.sort(exmp);
	    System.out.println("\n");
	    System.out.println("After sorting:\n" + Arrays.toString(exmp));
	  }
}
