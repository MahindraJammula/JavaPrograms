import java.util.Scanner;
public abstract class StringJoiner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName=sc.nextLine();
		System.out.println("Enter your last name");
		String LastName=sc.nextLine();
		String fullname =joinStrings(firstName, LastName);
		System.out.println("your full name is:"+fullname);
		
		
	}
	
	 static String joinStrings(String firstName, String LastName) {
		return firstName +" "+ LastName;
	 

	}

}
