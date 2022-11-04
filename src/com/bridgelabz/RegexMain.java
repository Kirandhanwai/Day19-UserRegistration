package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	static Pattern pattern = Pattern.compile("^[A-Z][A-Za-z]{2,}");

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.nextLine();

		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches())
			System.out.println(firstName + " is valid");
		else
			System.out.println(firstName + " is not valid");
		sc.close();
	}

}
