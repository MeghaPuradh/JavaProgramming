package String;

public class CapitalLetterInString {
	public static void main(String[] args) {
		String str = "MmEeGgHhAa";
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				System.out.println(str.charAt(i));
			}
		}
	}
}

