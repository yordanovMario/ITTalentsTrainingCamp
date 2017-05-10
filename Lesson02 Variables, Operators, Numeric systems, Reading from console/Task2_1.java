package com.mario;

import java.util.Scanner;

public class Task2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert two different numbers.");
		System.out.println("Number 1:");
		int num1 = sc.nextInt();
		System.out.println("Number 2:");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		int razlika = num1 - num2;
		int proizv = num1 * num2;
		int div = num1 / num2;
		int ost = num1 % num2;
		System.out.println();
		System.out.println("Number 1 + Number 2 = " + sum);
		System.out.println("Number 1 - Number 2 = " + razlika);
		System.out.println("Number 1 * Number 2 = " + proizv);
		System.out.println("Number 1 / Number 2 = " + div);
		System.out.println("Number 1 % Number 2 = " + ost);

	}

}
