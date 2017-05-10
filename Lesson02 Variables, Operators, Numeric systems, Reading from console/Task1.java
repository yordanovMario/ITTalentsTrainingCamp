package com.mario;

import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert value for A:");
		double A = sc.nextDouble();
		System.out.println("Insert value for B:");
		double B = sc.nextDouble();
		System.out.println("Insert value for C:");
		double C = sc.nextDouble();
		boolean result = (A<C && C<B) || (B<C && A>C);
		if(result == true){
			System.out.println("The number "+C+" is between "+A+" and "+B+".");
		}
		else{
			System.out.println("The number "+C+" is not between "+A+" and "+B+".");
		}

	}

}
