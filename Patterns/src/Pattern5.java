
public class Pattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
		for(int j=1;j<=9;j++){
				if(i+j>=6 && j-i<=4) {
					System.out.print((char)(64+i));
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}for(int i=1;i<=5;i++) {
			for(int j=1; j<=9;j++) {
				if(i<=j && j-i>8) {
					System.out.print((char)(69+i));
				}else {
					System.out.print(" ");
				}
			}System.out.println("");
		}//System.out.println(" ");
	}
}
