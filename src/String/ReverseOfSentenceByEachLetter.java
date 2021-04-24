package String;

public class ReverseOfSentenceByEachLetter {
	public static void main(String[] args) {
		String str = "we love java"; //ew evol avaj
		String[] str1 = str.split(" ");
		for(int i=0; i<=str1.length-1; i++) {
			System.out.print(str1[i]+ " ");
		}
		System.out.println();
		for(int i=0; i<=str1.length-1; i++) {
			String arr = str1[i];
			for(int j=arr.length()-1; j>=0;j--) {
				System.out.print(arr.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
