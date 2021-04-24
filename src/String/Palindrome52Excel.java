package String;

public class Palindrome52Excel {
	
	public static void checkPalindrome() {
		String s = "malayalam";
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--) {
			 s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
		//s1 = s1.toUpperCase();
		//if(s.compareTo(s1) >= 0)  //uppercarse -> ">=0" lowercase -> "<=0"
		if(s.equals(s1))
			System.out.println("Palindrome is working");
		else {
			System.out.println("Not Palindrome");
		}
	}
	public static void main(String[] args) {
		Palindrome52Excel cp = new Palindrome52Excel();
		//cp.checkPalindrome();
		
		checkPalindrome();
	}

}
