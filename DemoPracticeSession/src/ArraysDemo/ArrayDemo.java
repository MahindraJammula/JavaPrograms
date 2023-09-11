package ArraysDemo;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Student[] st = new Student[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < st.length; i++) {
			st[i] = new Student();
		}

		for (int i = 0; i < st.length; i++) {
			System.out.println("Enter Student -" + i + " Name ");
			st[i].name = sc.next();
			System.out.println("Enter Student - " + i + " Age ");
			st[i].age = sc.nextInt();
			sc.nextLine();
		}

		for (int i = 0; i < st.length; i++) {
			System.out.println(" Student = " + (i + 1) + " " + st[i].age + " - " + st[i].name);
		}
	}
}
