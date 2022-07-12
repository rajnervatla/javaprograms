package Arrays;

public class CountStringLengthwihoutUsing {
	
	public static void main(String[] args) {
		
		
		String name="RajkumarNervatla";
		
		System.out.println(CountStringLengthwihoutUsing.getTheLengthofString(name));
	}
	

public static int getTheLengthofString(String str)
{
	int length=0;
	char [] strCharArray=str.toCharArray();
	for(char c:strCharArray)
	{
		length++;
	}
	return length;
}
}
