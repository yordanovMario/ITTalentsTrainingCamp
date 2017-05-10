package com.mario;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a 4-digit number:");
		int num = sc.nextInt();
		int num1 = (((num/1000)*10 + num%10));
		int num2 = (((num/100)%10)*10 + ((num/10)%10));
		System.out.println("The new numbers are "+num1+" and "+num2+".");
		if(num1==num2){
			System.out.println("Number 1 is equal to Number 2.");
		}
		else{
			if(num1<num2){
				System.out.println("Number 1 is smaller than Number 2.");
			}
			else{
				System.out.println("Number 1 is greater than Number 2.");
			}
		}
	}

}
