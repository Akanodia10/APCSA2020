package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Arnav Kanodia
//Date -2/26/20

import java.util.ArrayList;

public class ListOddToEven
{
	public static int go( ArrayList<Integer> ray )
	{
		for (int i=0; i<ray.size(); i++) {
			if (ray.get(i)%2==1) {
				for (int a =ray.size()-1; a>0; a--) {
					if (ray.get(a)%2==0) {
 						return (ray.lastIndexOf(ray.get(a)) - ray.indexOf(ray.get(i)));
					}
				}
			}
		}
		return -1;
	}
}