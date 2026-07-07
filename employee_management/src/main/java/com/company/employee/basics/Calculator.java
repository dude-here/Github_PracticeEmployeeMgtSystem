package com.company.employee.basics;

public class Calculator {

	public int add(int a, int b) {
		return a + b; //
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	// created via multiplication branch
	public int multiply(int a, int b) {

		return a * b;

	}

	public int division(int a, int b) {
		return a / b;

	}
	
	
	public double average(double a,double b,double c){
		return (a + b + c) / 3.0;

	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		System.out.println("Addition : " + calculator.add(20, 10));
		System.out.println("Subtraction : " + calculator.subtract(20, 10));
		System.out.println("Multiplication is : " + calculator.multiply(20, 10));
		System.out.println("Division is : " + calculator.division(20, 10));
		System.out.println("Division is : " + calculator.average(30.0, 10.0,50.0));

	}
}