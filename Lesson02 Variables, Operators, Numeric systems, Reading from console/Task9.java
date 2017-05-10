package com.mario;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert two 2-digit numbers:");
		System.out.println("Number a:");
		int a = sc.nextInt();
		System.out.println("Number a:");
		int b = sc.nextInt();
		int ab = a*b;
		if((a<=99 && b<=99)&&(a>=10 && b>=10)){
			System.out.println(a+"*"+b+" = "+ab);
			if(ab%2==0){
				System.out.println("The product of "+a+" and "+b+" is an even number.");
			}
			else{
				System.out.println("The product of "+a+" and "+b+" is not an even number.");
			}
		}
		else{
			System.out.println("Invalid numbers!");
		}
		
		if((a<=99 && b<=99)&&(a>=10 && b>=10)){
			if((ab%10)%2==0){
				System.out.println("The last digit of the product of "+a+" and "+b+" is an even number.");
			}
			else{
				System.out.println("The last digit of the product of "+a+" and "+b+" is not an even number.");
			}
		}
		
		}
}
