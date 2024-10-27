package practice;

public class Example8_1 {
	public static void main(String[] args) {
		int num=12345;
		System.out.println("sum of digits:" + getsum(num));
	}
	static int getsum(int num)
	{
		if(num==0)
			return 0;
		return (num%10) + getsum(num/10);
	}

}
