package practice;

public class Example7 {
	public static void main(String[] args) {
		int n=29;
		if( isPrime (n))
			System.out.println(n + " "+"is Prime");
		else
			System.out.println(n + " " + "is NotPrime");
	}
	static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		else if(n==2)
			return true;
		else if(n%2==0)
			return false;
		for(int i = 3;i <= Math.sqrt(n);i += 2)
		{
			if (n%i==0)
				return false;
		}
		return true;
	}
	

}
