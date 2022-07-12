package programs;

public class ReverseEachWordinString {
	public static void main(String[] args) {

		String str = "Welcome to java ";
		String words[] = str.split(" ");// Split string into multiple words

		String reverseString = "";

		for (String w : words) {
			String reverseword = "";
			for (int i = w.length() - 1; i >= 0; i--)// count how many chars are there in Word
			{
				reverseword = reverseword + w.charAt(i);
			}
			reverseString = reverseString + reverseword + " ";
		}

		System.out.println("Reverse words with logic  :: "+reverseString);

		// Approach Reverse word in a string

		String str2 = "Checking with another logic";
		String[] words2 = str2.split("\\s");

		String reverseword1 = "";

		for (String w1 : words2) {
			StringBuilder sb = new StringBuilder(w1);
			sb.reverse();
			reverseword1 = reverseword1 + sb.toString() + " ";
		}

		System.out.println("String builder :: "+reverseword1);

	}

}
