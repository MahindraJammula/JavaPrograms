import java.util.Scanner;

public class Message {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The Decoded message");
		char c =sc.next().charAt(0);
		System.out.println("The Decoded Message =" +decodedMessage(c));
	

	}

	static int decodedMessage(char c) {
		return (int) c;
	}

}
