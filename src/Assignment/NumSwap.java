package Assignment;

public class NumSwap {

	public static void main(String[] args) {
		
		int a=25;
		int b=75;
		
		a=a+b; //25+75=100
		b=a-b; //100-75=25
		a=a-b ;//100-25=75
				System.out.println(a+" is new value of a ");
				System.out.println(b+" is new value of b");
	}

}
