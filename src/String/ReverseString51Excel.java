package String;

public class ReverseString51Excel {
	public static void main(String[] args) {
		String s = "Megha";
		int min=0, max=s.length()-1;
		while(min <= max) {
			System.out.print(s.charAt(max));
			max--;
		}
	}
}
