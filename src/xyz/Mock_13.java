package xyz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Mock_13 {
	//
	public static void main (String args[]){
		
		String str="ABHSYABJSHYABBABJHDLA";
		int count=0;
		for(int i=0;i<str.length()-1;i++){
			
			if(str.charAt(i)=='A' && str.charAt(i+1)=='B'){
				
				count++;
			}
		}
		System.out.println(count);
	}
}
