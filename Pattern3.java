import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;
		int j ;
		for(int i=1;i<=n;i++) {
			for( j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=1; k<=2*n-2*i;k++) {
				System.out.print(" ");
			}
			for( j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			sc.close();
	}

}
