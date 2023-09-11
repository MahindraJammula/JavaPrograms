
public class Diagonal7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				//if (i <= j && i+j<= 6) { 
				if(i+j>=4 && j-i<=2){
					//System.out.print("*");
					System.out.print((char)(70-i));
					//System.out.print((char)(70-j));
					//System.out.print(i);
					//System.out.print(j);
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}
