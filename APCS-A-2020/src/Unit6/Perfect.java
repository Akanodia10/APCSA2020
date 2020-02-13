package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Arnav Kanodia


public class Perfect
{
   private int number;

	public Perfect() {
		setNumbers(0);
	}
	
	public Perfect(int a) {
		setNumbers(a);
	}
	
	public void setNumbers (int a) {
		
		number=a;
	}
   
	public boolean isPerfect()
	{
        int total = 0;
		
		for (int i = 1; i < number; i++)
		{
			if (number % i == 0)
			{
				total = total + i;
			}
			
		}
		
		if (total == number)
		{
			return true;
		}
		
		return false; 
	}

	public String toString()
	{
		if (isPerfect() == true) {
			String output = number + " is perfect";
			return output;
		}
		String output = number + " is not perfect";
		return output;
		
	}
	
}