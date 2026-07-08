package com.company.employee.basics;

public class Calculator {

	public int add(int a, int b) {
		return a + b; //
	}

	public int subtract(int a, int b) {
		return a - b;
	}
	
	//this method added in Github(Origin) main and committed in  Github/Origin
	public int modulus(int a, int b) {
		return a % b;
	}
	
	
	/* DELETED This method via deleteDivisionfeature using 2nd commkit via this branch only
	// created via multiplication branch
	public int multiply(int a, int b) {

		return a * b;

	}*/

	/* DELETED this method via locally created "deleteDivisionfeature"
	public int division(int a, int b) {
		return a / b;

	}*/
	
	/*  deleting this method from Origin main here remotely only
	public double average(double a,double b,double c){
		return (a + b + c) / 3.0;

	}*/

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		System.out.println("Addition : " + calculator.add(20, 10));
		System.out.println("Subtraction : " + calculator.subtract(20, 10));
		//System.out.println("Multiplication is : " + calculator.multiply(20, 10));
		//System.out.println("Division is : " + calculator.division(20, 10));
		//System.out.println("Division is : " + calculator.average(30.0, 10.0,50.0));
		System.out.println("Division is : " + calculator.modulus(30, 10));//also added in Origin Main

	}
}
