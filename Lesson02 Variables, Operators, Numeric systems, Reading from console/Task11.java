package com.mario;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a 3-digit number, without using 0:");
		int abc = sc.nextInt();
		int a = (abc%1000)/100;
		int b = (abc%100)/10;
		int c = (abc%10);
		if(a==0||b==0||c==0){
			System.out.println("Invalid number.");
		}
		if(abc%a==0 && abc%b==0 && abc%c==0){
			System.out.println("The number can be divided by each of its 3 digits.");
		}
		else{
			System.out.println("The number can not be divided by each of its 3 digits.");
		}

	}

}
