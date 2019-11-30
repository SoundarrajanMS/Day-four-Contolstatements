package org.practicedD4;

import java.util.Scanner;

public class Citizenship {
	public static void main(String[] args) {
		System.out.println("Enter Your Age Below:");
		Scanner r =new Scanner(System.in);
	int age = r.nextInt();{
	if(age>=18) {
		System.out.println("Your are eligible for Voting");
	}
	else
		System.out.println("Your are not eligible for Voting");
	
	}

}
}