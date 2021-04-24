package String;

public class MutableImmutable_StringBuilder {
	public static void main(String[] args) {
		String s = "I am Megha";
		
		//string is immutable
		System.out.println(s.hashCode());
		s = s+"U are Saurav";
		System.out.println(s.hashCode());
		
		//string is mutable in string builder and string buffer
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.hashCode());
		sb.append("U are Saurav");
		System.out.println(sb.hashCode());
		
		
		
		
	}
}
