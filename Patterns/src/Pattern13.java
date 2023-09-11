
public class Pattern13 {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=7;i++) {
			if(i<=5) {
				k++;
			}else {
				k--;
			}
			for(int j=1;j<=7;j++) {
				//if(j>=5-k && j<=k+3)
				//if(j>=k-5 && j<=k-0 )..
				if(j>=5-k && j<=k+3)
				{
					System.out.print("*");
				}else {
					System.out.print("");
				}
			}System.out.println("");
		}
	}
}
