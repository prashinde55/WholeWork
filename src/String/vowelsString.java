package String;

public class vowelsString {

	public static void main(String[] args) {
		
		String a="good mroning india";
	int count =0;
	
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				System.out.println(ch);
				count++;
			}
		}
	System.out.println(count);		
	}

}
