package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arnav Kanodia
//Date - 2/26/20

import java.util.List;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		if (numArray.size() > 1) {
		for (int i=0; i<numArray.size()-1; i++) {
			if (numArray.get(i+1) >= numArray.get(i)) {
				return false; 
			}
		}
		return true;
	}
		return false;
	}
}