public class BreakStatement {

	public static void main(String[] args) {
		int num=500;
		for(int i=1;i<=num;i++) {
			if(i%10==0) 
			break;
			else {
				System.out.println(i);
				}
		System.out.println("Inside Loop");
			
		}
		System.out.println("-------->Outside Loop<----------");

	}

}
