package programs;

import java.util.HashMap;
import java.util.Iterator;

public class OccurancesOfWords {
	
	
	
	static void findDuplicateWords(String str)
	{
		
		
		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		
		String s[]=str.split(" ");
		for(String tempString:s)
		{
			if(hm.get(tempString)!=null)
			{
				hm.put(tempString,hm.get(tempString)+1);
				
			}
			else
			{
				hm.put(tempString,1);
			}
		}
		Iterator<String> tempString1=hm.keySet().iterator();
		while(tempString1.hasNext())
		{
			String temp=tempString1.next();
			
			if(hm.get(temp)>1)
			{
				System.out.println("number of words "  +temp+  " Appeared = "+hm.get(temp)+"Number of times");
			}
		}
		
		
	}
	
	static void findDuplicateCharacters(String s)
	{
		HashMap<Character, Integer> hc=new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
			
		{
			char c=s.charAt(i);
			
			if(hc.get(c)!=null)
			{
				hc.put(c, hc.get(c)+1);
			}
			hc.put(c, 1);
		}
		
		System.out.println(hc);
	}

	

	public static void main(String[] args) {
		
		findDuplicateWords(" This is my first java java prog prog");
		findDuplicateCharacters("My Name is Rajkumar rajkumar");
	
	}
}
