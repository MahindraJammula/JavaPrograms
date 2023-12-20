import java.util.Scanner; 
public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a charcter:");
		char c = sc.next().charAt(0);
		if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
		{
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
		

	}

}
