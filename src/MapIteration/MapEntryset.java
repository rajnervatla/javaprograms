package MapIteration;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapEntryset {
	
	public static void main(String[] args) {
		
		
		Map<String, String> map=new HashMap<>();
		map.put("Script", "Selenium");
		map.put("lang", "java");
		map.put("Repo", "Git");
		
		for(Map.Entry<String, String> entry:map.entrySet())
		{
			System.out.print("Key ="+entry.getKey()+""+" Value"+entry.getValue());
		}
		
		
	}

}
