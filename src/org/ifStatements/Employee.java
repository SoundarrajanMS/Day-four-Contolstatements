package org.ifStatements;

public class Employee {
	public static void main(String[]args) {
		int a=40,b=50,c=60;
		if ((a>b)&&(a>c)) {
			System.out.println("a is greater");
			
			}
		else
			if((b>a)&&(b>c)) {
				System.out.println("b is greater");
		}
			else
				System.out.println("c is greater");
	}

}
