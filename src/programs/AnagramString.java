package programs;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String str1 = "Heart";
		String str2 = "Earth";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {
			char arr1[] = str1.toCharArray();
			char arr2[] = str2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean result = Arrays.equals(arr1, arr2);

			if (result) {
                 System.out.println(str1+ "  and "+str2+"  Are Anagram");
			}
			else
			{
				System.out.println(str1+ "and "+str2+"Are not Anagram");
			}
		}
		else
		{
			  System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
	}
}
