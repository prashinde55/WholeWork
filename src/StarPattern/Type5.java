package StarPattern;

public class Type5 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int l=2;l<=4;l++) {
			for(int m=1;m<=l;m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}// not complete

}
