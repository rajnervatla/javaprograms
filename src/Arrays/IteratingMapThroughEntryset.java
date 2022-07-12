package Arrays;

import java.util.HashMap;
import java.util.Map;

public class IteratingMapThroughEntryset {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("City", "Chandrapur");
		map.put("ZIP", "442401");
		map.put("Name", "Rajkumar	");
		map.put("color", "Black");
		map.put("EDu", "MBA IT");
		map.put("BE", "Computer Engineering");
		map.put("State", "Maharashtra");

		for (Map.Entry<String, String> smap : map.entrySet())

		{
			System.out.println("Key  =  "+smap.getKey()+ "  value ::"+smap.getValue());
		}

	}
}
