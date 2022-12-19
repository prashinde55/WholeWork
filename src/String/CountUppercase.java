package String;

public class CountUppercase {

	public static void main(String[] args) {
	
		char a[]= {'m','a','A','9','%','E','Z','i'};
		int count=0;
	
		for(int i=0;i<a.length;i++) {
			if(Character.isUpperCase(a[i])) {
				System.out.println(a[i]);
				count++;
			}
			else if(Character.isLowerCase(a[i])) {
				System.out.println(a[i]);
				
			}
			
		}

	System.out.println(count);
		
		
	}

}
