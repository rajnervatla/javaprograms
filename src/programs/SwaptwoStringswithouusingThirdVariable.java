package programs;

public class SwaptwoStringswithouusingThirdVariable {
	
	public static void main(String[] args) 
	{
	// Create two string literals.	
	  String s1 = "Love";
	  String s2 = "You";
	  System.out.println("Before swapping, s1 = " +s1+ ", s2 = "+s2 );

	// Concatenate both the string s1 and s2 and store it in s1    
	   s1 = s1 + s2;    
	// Extract s2 from updated string s1.    
	   s2 = s1.substring(0, (s1.length() - s2.length()));    
	  
	// Extract s1 from updated string s1    
	   s1 = s1.substring(s2.length());   
	   System.out.println("After swapping, s1 = " +s1+ ", s2 = "+s2 );
	  }

}
