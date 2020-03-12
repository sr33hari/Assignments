package com.epsilon.assignment;

import java.util.Scanner;

public class ReverseWords {
	public static String reverseByWords(String sentence) { 
		// do stuff here
		String[] a= sentence.split(" ");
		String result="";
		for(int i=a.length-1;i>=0;i--)
		{
			result+=a[i];
			result+=" ";
		}
		System.out.println("the reversed string is " + result);
		return null; 
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
    	System.out.print("Enter a string: ");  
    	String str= sc.nextLine();   
    	sc.close();
    	reverseByWords(str);
	}
}
