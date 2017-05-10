package com.mario;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char celsius = 248;
	System.out.println("What's the temperature outside in C"+celsius+"?");
	int temp = sc.nextInt();
	if(temp<-20){
		System.out.println("It's icy cold!");
	}
	if(temp>=-20 && temp<0){
		System.out.println("It's cold!");
	}
	if(temp<15 && temp>=0){
		System.out.println("It's хладно!");
	}
	if(temp>=15 && temp<=25){
		System.out.println("It's warm!");
	}
	if(temp>25){
		System.out.println("It's hot!");
	}

	}

}
