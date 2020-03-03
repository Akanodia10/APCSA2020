package Unit11;



class Rational implements Comparable<Rational>
{
    private int numOne, denOne;
    
    public Rational() {
    	setRational(1,1);
    }
    public Rational( int i, int j) {
    	setRational(i, j);
    }

	public void setRational(int i, int j) {
		setNumerator(i);
		setDenominator(j);
	}

    public void setNumerator(int i) {
    	numOne = i;
    }
    
    public void setDenominator(int j) {
    	denOne = j;
    }
    
    public int getDenominator() {
    	return denOne;
    }
    public int getNumerator() {
    	return numOne;
    }
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int numerator = ( (numOne * other.getDenominator()) + (other.getNumerator() * denOne) );
		int denominator = ( denOne * other.getDenominator());
		numOne = numerator;
		denOne = denominator;
		
		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(numOne,denOne);
		numOne /= gcd;
		denOne /= gcd;

	}

	private int gcd(int numOne, int numTwo)
	{
			for (int i = Math.min(numOne, numTwo); i>1; i--) {
				if (numOne % i == 0 && numTwo % i == 0) return i;
			}
			return 1;
		}

	

	public Object clone ()
	{
		return new Rational (numOne, denOne);
	}

	
	public boolean equals( Object obj)
	{

		Rational blah = (Rational)obj;
		return (double)this.numOne/this.denOne == (double)blah.numOne/blah.denOne;
		

	}

	public int compareTo(Rational other)
	{
		if(equals(other))
		{
			return 0;
		}
		
		double total = (double)numOne/denOne;
		double otherTotal = (double)other.numOne/other.denOne;
		if(otherTotal < total) 
		{
			return 1;
		}
		return -1;
	}

	
	public String toString() 
	{
		return numOne + "/" + denOne;
	}
	
	
}