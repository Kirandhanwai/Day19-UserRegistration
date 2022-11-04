package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	static Pattern pattern = Pattern.compile("^[A-Z][A-Za-z]{2,}");

	static void check(String name) {
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches())
			System.out.println(name + " is valid");
		else
			System.out.println(name + " is not valid");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.nextLine();
		check(firstName);
		System.out.println("Enter Last Name");
		String lastName = sc.nextLine();
		check(lastName);

		sc.close();
	}

}
