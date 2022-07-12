package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		
		List<String> aList=new ArrayList<>();
		aList.add("New York");
		aList.add("New jersy");
		aList.add("New chandra");
		aList.add("New Delhi");
		aList.add("New AUs");
		aList.add("New dfd");
		aList.add("New ertr");
		
		for(String s:aList)
		{
			System.out.println(s);
		}
		
		
	}
}
