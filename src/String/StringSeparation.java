package String;

public class StringSeparation {
	public static void main(String[] args) {
		String str = "MeGhaSaUraV";
		String str1 = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				System.out.print(str.charAt(i));
			} else
				str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);
	}
}
