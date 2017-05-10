package com.mario;

import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert two different numbers");
		System.out.println("Number 1:");
		double num1 = sc.nextDouble();
		System.out.println("Number 2:");
		double num2 = sc.nextDouble();
		double sum = num1 + num2;
		double razlika = num1 - num2;
		double proizv = num1 * num2;
		double div = num1 / num2;
		double ost = num1 % num2;
		System.out.println();
		System.out.println("Number 1 + Number 2 = " + sum);
		System.out.println("Number 1 - Number 2 = " + razlika);
		System.out.println("Number 1 * Number 2 = " + proizv);
		System.out.println("Number 1 / Number 2 = " + div);
		System.out.println("Number 1 % Number 2 = " + ost);

	}

}
