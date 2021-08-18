package com.classMethodHomeworks;

public class Student {

	int getGrade(int score) {

		char grade;
		switch (score) {

		case 90:
			grade = 'A';
			break;

		case 80:
			grade = 'B';
			break;
			
		case 70:
			grade='C';
			break;
			
		case 50:
			grade='D';
			break;
			
			default:
				grade='F';
				break;

		}
System.out.println(grade);
		return score;

	}

}
