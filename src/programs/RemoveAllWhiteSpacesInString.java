package programs;

public class RemoveAllWhiteSpacesInString {

	
	public static void main(String[] args) {
		
		String str="Java Programming selenium automation";
		System.out.println("Before removing the white spaces  :: "+str);
		str=str.replaceAll("\\s", "");
		System.out.println("After removing the white spaces ::  "+str);
	}
}
