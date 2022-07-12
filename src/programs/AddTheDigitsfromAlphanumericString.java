package programs;

public class AddTheDigitsfromAlphanumericString {

	public static void main(String[] args) {

		String str = "Rajkumar454ndt45454";

		char a[] = str.toCharArray();
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			if (Character.isDigit(a[i])) {
				System.out.println("Number present in the string  " + a[i]);

				int num = Integer.parseInt(String.valueOf(a[i]));
				sum = sum +num;
			}
			System.out.println(sum);
		}
	}
}
