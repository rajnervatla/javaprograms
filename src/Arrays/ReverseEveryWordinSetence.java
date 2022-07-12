package Arrays;

public class ReverseEveryWordinSetence {

	public static void main(String[] args) {

		String str = "HOw are you";
		String reverse = "";
		String result = "";
		
		
		String arr[]=str.split("//s");
		
		
		for(String word:arr)
		{
			int j=word.length();
			
			while(j>0)
			{
				char ch=word.charAt(j-1);
				reverse=reverse+ch;
				j--;
			}
			result=result+reverse;
			
		}
		
		System.out.println(result);

	}

}
