import java.util.Scanner;
public class SemesterAverage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 8 semester marks=");
		int sem1=sc.nextInt();
		int sem2=sc.nextInt();
		int sem3=sc.nextInt();
		int sem4=sc.nextInt();
		int sem5=sc.nextInt();
		int sem6=sc.nextInt();
		int sem7=sc.nextInt();
		int sem8=sc.nextInt();
		double Semester = Semesters(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8);
		System.out.println("" +String.format("%.2f",Semester));
	}
	static double Semesters(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {	
		return (double)(sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
	}
}
