package com.classMethodHomeworks;

public class PrimeOrNot {
	
	int PrimeOrNot(int number) {
		
		 boolean isPrime = true;
	        
		 if(number>1) {
			 
	        for (int i=2; i <number; i++)
	        {
	            if ( number % i == 0)
	            {
	              isPrime=false;
	                break;
	            }
	        }
	      
		        }
		 if(isPrime) {
	    	   System.out.println(number+" is a prime number");
	       }else {
	    	   System.out.println(number+" is not a prime number");  
	       }
		 
		 return number;
		
		
	}

}
