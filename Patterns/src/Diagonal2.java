
public class Diagonal2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j<=6) {
					System.out.print(i);
					//System.out.println(j);
				}else {
					System.out.print("_");
				}
			}System.out.println();
		}

	}

}
