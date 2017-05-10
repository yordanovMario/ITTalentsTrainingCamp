package com.mario;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What time is it?");
		int hour = sc.nextInt();
		System.out.println();
		System.out.println("Are you ill? Please type true or false.");
		boolean bolen = sc.nextBoolean();
		if(bolen){
			System.out.println("Don't go out!");
		}
		else{
			System.out.println("Great!");
		}
		System.out.println();
		System.out.println("How much money do you have?");
		double pari = sc.nextDouble();
		if(bolen){
			if(pari>5){
				System.out.println("Go buy some medicines!");
			}
			else{
				System.out.println("Stay home and drink some tea!");
			}
		}
		else{
			if(pari<10){
				System.out.println("Go to a cafe!");
			}
			else{
				System.out.println("Go to the cinema with friends!");
			}
		}
		
	}

}
