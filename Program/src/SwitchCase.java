import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet:");
		char c = sc.next().charAt(0);
		switch (c) {
		case 'v':
		case 'V':
			System.out.println("violet");
			break;
		case 'i':
		case 'I':
			System.out.println("indigo");
			break;
		case 'b':
		case 'B':
			System.out.println("blue");
			break;
		case 'g':
		case 'G':
			System.out.println("green");
			break;
		case 'y':
		case 'Y':
			System.out.println("yellow");
			break;
		case 'o':
		case 'O':
			System.out.println("orange");
			break;
		case 'r':
		case 'R':
			System.out.println("red");
			break;
		default:

			System.out.println("Invalid Input");

		}
		System.out.println("---->THE END<----");

	}

}
