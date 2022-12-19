package Assignment;

public class PrimeNumm {

	public static void main(String[] args) {
     
	int a=2; int b=0;
	
	for(int i=2;i<a-1;i++) {
        if(a%i==0) {
		b=b+1;
		
	}
	}
        if(b==0) {
        	System.out.println(a+" prime num");
        }
        else {
        	System.out.println(a+" is non prime num");
        }
	
	
	
	
	
	}
	}
	


