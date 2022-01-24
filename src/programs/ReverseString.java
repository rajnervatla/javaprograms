package programs;

public class ReverseString {

	
	public static void main(String[] args) {
		
		
		/*Logic 1 :using string concatenation*/
		
		String str="Rajkumar";
		String reverse="";
		
		/*
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println("Reverse of the given string is :: "+reverse);*/
		
		
		//Logic 2 using character array
		/*
		 * char a[]=str.toCharArray(); int len=a.length;
		 * 
		 * for(int i=len-1;i>=0;i--) { reverse=reverse+a[i]; }
		 * 
		 * System.out.println(reverse);
		 */
		
		//Logic 3 using StringBuffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
