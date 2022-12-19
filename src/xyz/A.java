package xyz;

public class A {
	static int h=58;
	
int m=56;
	public static void main(String[] args) {
		
		
		

	}
	
	public final void mymethod() {
		int a=12;
		System.out.println(a);
		System.out.println("hello world");
	}
	
	public  A() {
		System.out.println(" this is default constructor");
	}
	
	public static void mymethod2() {
		//static int n=78;
		int i=45;
		System.out.println(i+" this is static method ");
	//	A.mymethod4();
		A oo=new A();
		oo.mymethod4();
		System.out.println(oo.m);
		System.out.println(i);
		
	}

	  public void mymethod4() {
		//  static int z=36;
		  int o=789;
		  System.out.println(o+" non static metthod");
		  
		  mymethod2();
		  
	  }
}
