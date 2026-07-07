package com.company.employee.strings;

public class StringUtility {

	public String reverse(String text) {

		return new StringBuilder(text).reverse().toString();
	}

	public int countCharacters(String text) {

		return text.length();
	}

	public static void main(String[] args) {

		StringUtility utility = new StringUtility();

		System.out.println("Reverse : " + utility.reverse("GitHub"));
		System.out.println("Length : " + utility.countCharacters("GitHub"));
	}
}