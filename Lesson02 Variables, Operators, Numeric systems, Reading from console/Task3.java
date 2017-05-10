package com.mario;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert two different numbers.");
		System.out.println("Number A:");
		int num1 = sc.nextInt();
		System.out.println("Number B:");
		int num2 = sc.nextInt();
		System.out.println();
		System.out.println("Swapped values:");
		System.out.println("Number A = "+num1*num2/num1);
		System.out.println("Number B = "+num2*num1/num2);
	}

}
