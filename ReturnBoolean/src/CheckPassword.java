import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("_____________________________PASSWORD RULES_________________________________");
		System.out.println("1. Password must be alphabhet(A-B/a-b) or Some special characters(@,*,#,&)");
		System.out.println("2. Dont use space");
		System.out.println("3. Password must contains 8 characters and not more than 15 characters");
		System.out.println("____________________________________________________________________________");
		System.out.print("Enter a Password : ");

		boolean match = false;
		while (match == false) {
			String password = scan.nextLine();
			if (password.length() >= 8 && password.length() <= 15) {
				for (int i = 0; i < password.length(); i++) {
					if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z'
							|| password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'
							|| password.charAt(i) >= '0' && password.charAt(i) <= '9') {
						match = true;
					} else if (password.charAt(i) == '@' || password.charAt(i) == '*' || password.charAt(i) == '#'
							|| password.charAt(i) == '&' || password.charAt(i) == 20) {
						match = true;
					} else {
						match = false;
						break;
					}
				}
				if (match == true) {
					System.out.println("---- " + password + " ----");
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
					System.out.println("@::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::@");
					System.out.println("@:::::::::::::::::::: YOUR PASSWORD WAS ACCEPTED ::::::::::::::::::::::::::@");
					System.out.println("@::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::@");
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				} else {
					System.out.println("____________________________________________________________________________");
					System.out.println("::::::::::::::::::: YOUR PASSWORD IS NOT ACCEPTED ::::::::::::::::::::::::::");
					System.out.println("============================================================================");
					System.out.println("NOTE : Password must be enter in below following rules)");
					System.out.println("1. Password must be alphabhet(A-B/a-b) or Some special characters(@, *, #, &");
					System.out.println("2. Dont use space");
					System.out.println("3. Password must contains 8 characters and not more than 15 characters");
					System.out.println("============================================================================");
					System.out.println("RE-ENTER Password : ");
				}

			} else {
				System.out.println("____________________________________________________________________________");
				System.out.println("::::::::::::::::::: YOUR PASSWORD IS NOT ACCEPTED ::::::::::::::::::::::::::");
				System.out.println("============================================================================");
				System.out.println("Password must contains 8 characters and not more than 15 characters");
				System.out.println("============================================================================");
				System.out.println("RE-ENTER Password : ");
			}
		}

		scan.close();
	}

}
