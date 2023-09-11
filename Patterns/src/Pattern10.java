
public class Pattern10 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=j) {
					//System.out.print(i);
					//System.out.print(j);
					System.out.print((char)(64+i));
				}else {
					System.out.print(" ");
					System.out.print("");
				}
			}System.out.println("");
		}
	}
}
