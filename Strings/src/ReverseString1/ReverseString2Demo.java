package ReverseString1;

public class ReverseString2Demo {

	public void printCharactersInReverse(String s1) {
		String[] srr = s1.split(" ");
		for (int i = 0; i <= srr.length - 1; i++) {
			charactersReverse(srr[i]);
		}
	}

	public void charactersReverse(String srr) {
		char[] crr = srr.toCharArray();
		for (int i = crr.length - 1; i >= 0; i--) {
			System.out.print(crr[i]+"");
		}
		System.out.println();
	}
}
