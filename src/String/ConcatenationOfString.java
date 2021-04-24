package String;

public class ConcatenationOfString {
 public static void main(String[] args) { 	
	 	String s = "I am Megha";
		String s1 = " U are Saurav";
		System.out.println(s+s1);
		System.out.println(s.concat(s1));
		
		StringBuilder sb = new StringBuilder(s);
		sb.append(s1);
		System.out.println(sb);
}
}
