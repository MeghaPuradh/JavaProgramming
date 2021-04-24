package String;

public class ReverseOfSentenceByName {
	public static void main(String[] args) {
		String str = "I love java coding";
		String[] str1 = str.split(" ");
		for (int i = str1.length-1; i >= 0; i--) {
			System.out.print(str1[i]+" ");
		}
	}
	
	public static void again() {
		String str = "I hate politics";
		String[] str1 = str.split("");
	}
}
