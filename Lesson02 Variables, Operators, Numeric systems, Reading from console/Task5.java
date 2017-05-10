package com.mario;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert 3 different numbers.");
		System.out.println("Number A:");
		int a = sc.nextInt();
		System.out.println("Number B:");
		int b = sc.nextInt();
		System.out.println("Number C:");
		int c = sc.nextInt();
		System.out.println();
		System.out.println("Sorted in descending order:");
		if(a>b&&b>c){
			System.out.println(a+", "+b+", "+c+".");
		}
		if(a>c&&c>b){
			System.out.println(a+", "+c+", "+b+".");
		}
		if(b>a&&a>c){
			System.out.println(b+", "+a+", "+c+".");
		}
		if(b>c&&c>a){
			System.out.println(b+", "+c+", "+a+".");
		}
		if(c>a&&a>b){
			System.out.println(c+", "+a+", "+b+".");
		}
		if(c>b&&b>a){
			System.out.println(c+", "+b+", "+a+".");
		}
		
	}

}
