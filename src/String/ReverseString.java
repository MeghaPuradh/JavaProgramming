package String;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Megha";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		name();
	}
	
	public static void name() {
		String s = "Megha";
		for (int i = s.length()-1; i >= 0; i--) {
		
			System.out.print(s.charAt(i));
		}
		
	}
}
