package com.mario;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a 3-digit number:");
		int abc = sc.nextInt();
		int a = (abc%1000)/100;
		int b = (abc%100)/10;
		int c = (abc%10);
		if(!((a==b&&b==c)||(a>b&&b>c)||(a<b&&b<c))){
			System.out.println("The digits are not ordered.");
		}
		if(a==b&&b==c){
			System.out.println("The digits are equal.");
		}
		else{
			if(a>b&&b>c){
				System.out.println("The digits are in ascending order.");
			}
			if(a<b&&b<c){
				System.out.println("The digits are in descending order.");
			}
		}
		
		
		
		
	}

}
