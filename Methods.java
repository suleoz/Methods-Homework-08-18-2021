package com.classMethodHomeworks;

public class Methods {

	//LARGEST ~ EVEN ODD NUMBER
	
	void largest (int num1, int num2) {
		
		if(num1>num2) {
			
			System.out.println(num1 +" is the largest number");
			
			
		}else {
			System.out.println(num2 +" is the largest number");
			
		}
		
		
	}
	
	
	
	void number(int num) {
		
		if(num%2==0) {
			System.out.println(num+" is an even number");
		}
		else {
			System.out.println(num+ " is an odd number");
		}
	}
}
