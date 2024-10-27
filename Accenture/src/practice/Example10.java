package practice;

public class Example10 {
	public static void main(String[] args) {
		int num=123456, reverse=0,rem;
		if(getreverse(num,reverse)==num)
			System.out.println(num +" is palindrome");
		else
			System.out.println(num + " is not palindrome");
	}
	static int getreverse(int num,int rev)
	{
		if(num==0)
			return rev;
		int rem=num%10;
		rev= rev*10+rem;
		return getreverse(num/10,rev);
	}

}
