package xyz;
import java.util.Scanner;
public class mock11 {
	public static void main(String args[]) {
		int pass=1234; int Tamount=1000; int fundtransfer=0;
		int a=1;int b = 2; int withdrawl=500; long AccountNumber = 0;
		Scanner Fund= new Scanner(System.in); int Tfamount=300;
		Scanner sc=new Scanner(System.in); long d=3; 
		
		
		for(int i=1;i<=3;i++) {
			System.out.println("Enter your password:");
			int userpass=sc.nextInt();
			
		if(userpass==pass) {
			
			System.out.println("You have login sucessfully ");
		
		
		System.out.println("Balance Enquire "+a);
	    System.out.println("WithDrawl "+b);
	    System.out.println("FundTransfer "+d);
	    
	 a=	sc.nextInt();
		//Balance enquire
		if(a==1) {
			System.out.println(" Your Balance is "+Tamount);
			}
		
		b=sc.nextInt();
		//Withdrawl
		if(b==2) {
			System.out.println("Enter amount to withdrawl ");
			
	
		Tamount=Tamount-sc.nextInt();;
			System.out.println(" Your Reamaning Balance is "+(Tamount));
		}
	d=	sc.nextInt();
		//FundTransfer
	if(d==3) {
				System.out.println("Enter Account Number: "+AccountNumber);
				d=Fund.nextLong();
				
				System.out.println("Enter Amount to be Transfer");
				
				//System.out.println("Enter Amount to transfer "+sc.nextInt());
				Tamount=Tamount-sc.nextInt();
				System.out.println("You have Sucessfully Transfer Fund");
				System.out.println("Reaming balance is "+Tamount);
		}
		
		}
		else if(userpass!=pass) {
			System.out.println("You have entered incorrect details , plz try again ");
		}
		if(userpass!=pass && i==3) {
			System.out.println("You reached out your limit , plz try again 24 hr ");
		}
		}
		
		}
		
	
}


