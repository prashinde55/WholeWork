package Assignment;

public class PrimeNUm {

	public static void main(String[] args) {
		int a=9;
		int b=0;
		for (int i=2;i<=a-1;i++) {
			if(a%i==0) {
				b=b+1;
			}
			
		}
		if (b==0) {
			System.out.println(a+" prime numb");
		}
		else {
			System.out.println(a+" it is not prime num");
		}
	}

}
