package com.Add;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
	    System.out.println("ENTER 2 NUMBERS");
	    int a = scan.nextInt();
	    int b = scan.nextInt();
  
    
       int res = AdditionTask.additionTask(a,b);
       System.out.println(res);
    
      
	}
}
