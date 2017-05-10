package com.mario;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert two different numbers.");
		System.out.println("Number A:");
		int a = sc.nextInt();
		System.out.println("Number B:");
		int b = sc.nextInt();
		System.out.println();
		System.out.println("Sorted in ascending order:");
		if(a>b){
			System.out.println(b+", "+a+".");
		}
		else{
			System.out.println(a+", "+b+".");
		}
		
	}

}
