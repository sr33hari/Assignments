package com.epsilon.assignment;
import java.util.*;

public class GenPass {
	
	public static String generatePassword(int length) {
		
	    String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz!@#$%&*()_+-=[]?0123456789";
	    String CHAR_UPPER = CHAR_LOWER.toUpperCase();
	    String masterString = CHAR_LOWER+CHAR_UPPER;
	    String result="";
	    
		for(int i=0;i<length;i++) {
			Random r = new Random();
			int num = r.nextInt();
			if(num<0)
			{
				num*=-1;
			}
			//System.out.println(num);
			int index = num%masterString.length();
			result+=masterString.charAt(index);
			
			
			
		}
		System.out.print(result);
		
			
		return null;
	
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		generatePassword(number);
	}

}
