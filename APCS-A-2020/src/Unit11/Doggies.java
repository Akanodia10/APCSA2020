package Unit11;


import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
      pups = new Dog[size];		
	}
	
	public void set(int spot, int age, String name)
	{
		Dog newPup = new Dog(age, name);
		if ( 0 <= spot && spot < pups.length)
		{
			pups[spot] = newPup;
		}
	}

	public String getNameOfOldest()
	{
		int dogCheckUno = 0;
		for (int i = 0; i < pups.length; i++)
		{
			if (pups[dogCheckUno].getAge() < pups[i].getAge())
			{
				dogCheckUno = i;
			}
		}
		return pups[dogCheckUno].getName();	}

	public String getNameOfYoungest()
	{
		int dogCheckDos = 0;
		for (int j = 0; j < pups.length; j++)
		{
			if (pups[dogCheckDos].getAge() > pups[j].getAge())
			{
				dogCheckDos = j;
			}
		}
		return pups[dogCheckDos].getName();	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}