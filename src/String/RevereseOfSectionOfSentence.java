package String;

public class RevereseOfSectionOfSentence {
	public static void main(String[] args) {
		String str = "Minnie is my sister"; // Minnie si ym sister 
		String[] str1 = str.split(" ");
		for(int i = 0; i<=str1.length-1; i++) {
			String arr = str1[i];
			if(i == 0 || i == str1.length-1) {
				System.out.print(str1[i]+ " ");
				continue;
			}else {
				for(int j=arr.length()-1; j>=0; j--) {
					System.out.print(arr.charAt(j));
				}
				System.out.print(" ");
			}
		}
		System.out.println();
		name();
	}
	
	public static void name() {
		String str = "Minnie is my sister"; // sister ym si einniM 
		String[] str1 =  str.split(" ");
		for(int i = str1.length-1; i>=0 ; i--) {
			String arr = str1[i];
			if(i == str1.length-1 ) {
				System.out.print(str1[i]+ " ");
				continue;
			}else {
				for(int j = arr.length()-1; j>=0; j--) {
					System.out.print(arr.charAt(j));
				}
				System.out.print(" ");
			}
		}
	}

}
