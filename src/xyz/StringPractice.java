package xyz;

public class StringPractice {

	public static void main(String[] args) {
		String str="India Is My Country";
		String str1="india is My country";
		String a1="hello";
		String a3="hello";
		String a2=new String ("hello");
		
		boolean f1 = a1.equals(a2);
		System.out.println(f1);
		
		boolean w = a1==a3;
		System.out.println(w);
		
		boolean e = str.equalsIgnoreCase(str1);
		System.out.println(e);
		// -----------------------------
		
		String b1 = str.toUpperCase();
		System.out.println(b1);
		
		String b2=str.toLowerCase();
		System.out.println(b2);
		
        //------------------------------------
		
	String c1 = a1.concat(a2);
	System.out.println(c1);
	    //------------------
	
	String d1 = str.substring(5);
	
	System.out.println(d1);
	
	CharSequence d2 = str.subSequence(0, 7);
	System.out.println(d2);
	
	
	String d3 = str.substring(0, 7);
	System.out.println(d3);
	
	//-----------------------
	
	String[] e1 = str.split(" ");
	
	System.out.println(e1[2]);  // here 2 indicate 2 index location of string after split
	
	boolean e2 = str.contains("My");
	System.out.println(e2);
	
	   String e3 = str.replace(" ", "**");
	   System.out.println(e3);
	
	   //--------------------
	   
	  int f2 = str.length();
	   
	   System.out.println(f2);
	   
	  char f3 = str.charAt(6);
	   
	   System.out.println(f3);
	   
	   
	   
	   
	   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
