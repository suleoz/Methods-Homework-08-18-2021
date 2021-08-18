package com.classMethodHomeworks;

public class Country {
	
	//Create a method that will say Hello in different language 
	//based on the country that will passed when method is executed.
	
	String country(String name) {
		
		String hello;
		switch (name) {
		
		case "Turkey":
			System.out.println("Merhaba");
		break;
		
		case "Italy":
			System.out.println("Ciao");
		break;
		
		case "England":
			System.out.println("Hello");
		break;
		
		case "Spain":
			System.out.println("Hola");
		break;
		
		case "USA":
		System.out.println("Hello");
		break;
		
		case "South Africa":
			System.out.println("Molo"); 
		break;
		
		case "India":
			System.out.println("namaste");
			break;
		}
		
		
		return name;
	}

}
