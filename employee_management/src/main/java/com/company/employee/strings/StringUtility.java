package com.company.employee.strings;

public class StringUtility {

	public String reverse(String text) {

		return new StringBuilder(text).reverse().toString();
	}

	
	// 1. Convert to Uppercase and ADDED via String branch 
    public String toUpper(String text) {
        return text.toUpperCase();
    }
	
    // 2. Concatenate Strings and ADDED via String branch
    public String concatenate(String str1, String str2) {
        return str1.concat(str2);
    }
    
    
    //3. Remove First Character and Added via 2nd Commit via String branch
    public String removeFirstCharacter(String text) {
        return text.substring(1);
    }
    
	//second Bug Resolved in the BugFixBranch
	public int countCharacters(String text) {

		return text.length();
	}
	
	// 4. Remove Last Character 
	//Fixed This Bug in BugFixBranch
    public String removeLastCharacter(String text) {
        return text.substring(0, text.length() - 1);
    }

	public static void main(String[] args) {

		StringUtility utility = new StringUtility();

		System.out.println("Reverse : " + utility.reverse("GitHub"));
		System.out.println("Length : " + utility.countCharacters("GitHub"));
		System.out.println("Uppercase : "+utility.toUpper("jaydev"));
		System.out.println("Uppercase : "+utility.concatenate("jaydev","rathod"));
		System.out.println("Uppercase : "+utility.removeFirstCharacter("rathod"));
		System.out.println("Uppercase : "+utility.removeLastCharacter("tanmay"));
		
	}
}
