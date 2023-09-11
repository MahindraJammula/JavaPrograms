import java.util.Scanner;
public class Difference {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int difference=a-b;
        if(difference>0) {
        	System.out.println(difference);
        }
        else {
        	System.out.println(difference*-1);
        }
	}

}
