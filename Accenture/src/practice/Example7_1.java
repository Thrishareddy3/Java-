package practice;

public class Example7_1 {
	public static void main(String[] args) {
		int lower=1, upper= 30;
		for(int i=lower; i<=upper;i++)
			if(isPrime(i))
				System.out.println(i);
	}
	static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		if(n==2)
			return true;
		if(n%2==0)
			return false;
		for(int i=3; i<= Math.sqrt(n);i+=2)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
		
			
		
	}


