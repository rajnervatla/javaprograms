package Arrays;

public class Reverseword {

	
	public static void main(String[] args) {
	
		
		String result="";
		String sentence="HI Hello i am reversing the string";

		String arr[]=sentence.split("\\s");


		for(int i=arr.length-1;i>=0;i--)
		{
		result=result+arr[i]+"   ";
		}
		System.out.println("Reverse word  ::  "+result);
		}

	}
	
	

