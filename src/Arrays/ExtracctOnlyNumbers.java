
package Arrays;

public class ExtracctOnlyNumbers {
	public static void main(String[] args) {
		String str = "Automation23tiontest343";
		//String numberOnly = str.replaceAll("[^0-9]", "");
		//System.out.println(numberOnly);

		
		 String line = "This order was32354 placed 999for QT ! OK?"; 
		 String regex = "[^\\d]+";
		  
		  String[] str1 = line.split(regex);
		  
		  System.out.println(str1[1]);
		

			/*
			 * String str1 = "2.53GHz"; String decimal_values =
			 * str1.replaceAll("[^0-9\\.H]", ""); System.out.println(decimal_values);
			 */
	}
}
