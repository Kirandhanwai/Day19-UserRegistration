package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	static void check(String name, Pattern pattern) {
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches())
			System.out.println(name + " is valid");
		else
			System.out.println(name + " is not valid");

	}

	public static void main(String[] args) {

		Pattern namePattern = Pattern.compile("^[A-Z][A-Za-z]{2,}");

		Pattern emailPattern = Pattern.compile("^[a-z]{1,}[\\.]?[a-z]*[\\@][a-z]{1,}[\\.][a-z]{1,}[\\.]?[a-z]*$");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.nextLine();
		check(firstName, namePattern);
		System.out.println("Enter Last Name");
		String lastName = sc.nextLine();
		check(lastName, namePattern);
		System.out.println("Enter email id Name");
		String email = sc.nextLine();
		check(email, emailPattern);
		sc.close();
	}

}
