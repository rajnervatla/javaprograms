package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementFindingThroughSET {
	
	public static void main(String[] args) {
		
		int arr[]={1,23,4,5,67,4};

		Set<Integer> hs=new HashSet<Integer>();

		for(int x:arr)
		{
		if(!hs.add(x))
		{
			System.out.println("Dupllicate element is "+x);
		}

	}

	}}
