package practice;

public class Example9_1 {
	public static void main(String[] args) {
		int num=1234;
		getreverse (num);
		
	}
	static void getreverse(int num)
	{
		if(num==0)
			return;
	 int rem=num%10;
		System.out.print(rem);
		getreverse(num/10);
	}

}
