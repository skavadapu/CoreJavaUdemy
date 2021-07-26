
public class Palindrome {

	public static void main(String[] args) {
		
		// Palindrome means the string is same even reverese it e.g. madam
		
		String s = "madam";
		
		//reverse the string and add to temp string and then compare
		String temp=""; //empty string
		
		for(int i=s.length()-1; i>=0; i--) {
			
			temp=temp+s.charAt(i);
		}
		System.out.println(s);
		System.out.println("String in reverse order :"+temp);
		
		if(s.equals(temp)) {
			System.out.println("Given String is Palindrom");
		}
		else
		{
			System.out.println("Given string is not Palindrome");
		}

	}

}
