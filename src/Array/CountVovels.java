package Array;

public class CountVovels {

	public static void main(String[] args) {

 char a[]= {'a','D','5','i','Z','k'};
  int count=0;
  
 for(int i=0;i<a.length;i++) {
	 
	 if (Character.isUpperCase(a[i]) ) {
		 System.out.println(a[i]);
		 count++;
	 }
	 else if(Character.isDigit(a[i])) {
		 System.out.println(a[i]);
	 }
 }
 
		
	System.out.println(count);	
		
	}

}
