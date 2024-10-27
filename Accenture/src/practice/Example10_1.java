package practice;

public class Example10_1 {
	public static void main(String[] args) {
		String str="abba";
		String reversestr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reversestr+=str.charAt(i);
		}
		if(str.equals(reversestr))
		{
			System.out.println(str +" is palindrome");
		}
		else {
	       System.out.println(str + "is not palindrome");
		}
			
	}

}
