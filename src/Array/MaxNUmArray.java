package Array;

public class MaxNUmArray {

	public static void main(String[] args) {


		int a[]= {12,25,3,84};
	int max =a[0];
	  for (int i=0;i<a.length;i++) {
		 if (a[i]>max) {
			 max=a[i];
			 
		 }
		  
	  }
		System.out.println(max);
		
	}

}
