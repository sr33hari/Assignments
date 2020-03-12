package com.epsilon.assignment;

import com.epsilon.util.KeyboardUtil;

public class Eighteen {
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	
	public static void main(String[] args) {
		
		System.out.print("Your number loop will now begin \n");
		boolean flag=true;
		String numbers= "";
		int sum=0;
		String notn="";
		int i = 0;
		int k=0;
		while(flag) {
			
			String input= KeyboardUtil.getString("Enter the number you wish to enter : ");
			if(isNumeric(input)) {
				numbers+=input+" ";
				int x = Integer.parseInt(input);
				sum+=x;
				k++;
			}
			else {
				notn+=input + " ";
			}
			
			String response=KeyboardUtil.getString("Do you wish to continue? Enter yes or no: ");
			String responsel=response.toLowerCase();
			System.out.println(responsel);
			if(responsel.equals("no")) {
				flag=false;
			}
			i++;
		
		}
		System.out.println("The number of inputs are : " + i);
		System.out.println("The number of integer inputs are : " + k);
		System.out.println("The number of non integer inputs are : " + (i-k));
		System.out.println("Sum of all the integers are : " + sum);
		System.out.println("The integer inputs are : " + numbers);
		System.out.println("The non-integer inputs are : " + notn);
		
	}
	
}
