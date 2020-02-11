package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arnav Kanodia
//Date - 2/11/2020


public class FirstLastVowel
{
    
	public static String go( String a )
	{
		String beg = a.substring(0,1);
		String end = a.substring(a.length()-1, a.length());
	    String v = "aeiouAEIOU";
		
		if (v.contains (beg) || v.contains (end)) {
			return ("yes");
		}
		else {
			return ("no");
		}
		}
		
		}
				
				

