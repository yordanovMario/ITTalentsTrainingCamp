package com.mario;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert 3 numbers.");
		System.out.println("Number a1:");
		int a1 = sc.nextInt();
		System.out.println("Number a2:");
		int a2 = sc.nextInt();
		System.out.println("Number a3:");
		int a3 = sc.nextInt();
		System.out.println();
		System.out.println("Swapped values:");
		System.out.println("Number a1 = "+a1*a2/a1);
		System.out.println("Number a2 = "+a2*a3/a2);
		System.out.println("Number a3 = "+a3*a1/a3);

	}

}
