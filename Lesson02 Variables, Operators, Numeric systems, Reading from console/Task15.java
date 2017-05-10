package com.mario;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's the time?");
		int hour = sc.nextInt();
		System.out.println();
		if(hour>=18 && hour<=24 || hour>=0 && hour<4){
			System.out.println("Good Evening!");
		}
		if(hour>=4 && hour<=9){
			System.out.println("Good Morning!");
		}
		if(hour>9 && hour<18){
			System.out.println("Good day!");
		}
		if(hour>24 || hour<0){
			System.out.println("Invalid value.");
		}
	}

}
