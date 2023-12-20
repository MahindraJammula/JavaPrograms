import java.util.Scanner;

public class FirstLetterCaptial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		String res = captilizedWords(str);
		System.out.println(res);
	}

	public static String captilizedWords(String str) {
		String[] words = str.split(str);
		StringBuilder sb = new StringBuilder();
		for (String string : words) {
			if (string.isEmpty()) {
				char first = Character.toUpperCase(string.charAt(0));
				String rest = string.substring(1).toLowerCase();
				sb.append(first).append(rest).append("");
			}
		}
		return sb.toString().trim();
	}
}
