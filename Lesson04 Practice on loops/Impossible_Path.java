import java.util.Random;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Impossible_Path {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("HELLO! WELCOME TO IMPOSSIBLE PATH!");
		System.out.println("Your goal is to move the X to the bottom right(F)");
		System.out.println("by pushing it using P.");
		System.out.println("Your direction options are:");
		System.out.println("w - up");
		System.out.println("d - right");
		System.out.println("s - down");
		System.out.println("a - left");
		System.out.println("Warning: you should NOT cross the borders or the bushes (*)");
		System.out.println("Please, choose difficulty:");
		System.out.println("Rookie - press 1");
		System.out.println("Beginer - press 2");
		System.out.println("Advanced - press 3");
		System.out.println("Professional - press 4");
		System.out.println("Insane - press 5");
		System.out.println("Impossible - press 6");
		int difficulty = sc.nextInt();
		while(difficulty < 1 || difficulty > 6){
			System.out.println("Incorrect input!");
			System.out.println("Please, enter difficulty");
			difficulty = sc.nextInt();
		}
		int bushes = 0;
		switch (difficulty) {
		case 1:
			bushes = 20;
			break;
		case 2:
			bushes = 30;
			break;
		case 3:
			bushes = 50;
			break;
		case 4:
			bushes = 100;
			break;
		case 5:
			bushes = 150;
			break;
		case 6:
			bushes = 300;
		}
		
		char[][] ring = new char[25][50];
		
		//naprava na ramkata na ringa
		for(int i = 0; i < 25; i++){
			for(int j = 0; j < 50; j++){
				ring[i][j] = '?';
			}
		}
		for(int i = 1; i < 24; i++){
			for(int j = 1; j < 49; j++){
				ring[i][j] = ' ';
			}
		}
		
		Random ran = new Random();
		
		//generirane na skalichka
		int rockIndexI = ran.nextInt(22) + 2;
		int rockIndexJ = ran.nextInt(47) + 1;
		ring[rockIndexI][rockIndexJ] = 'X';
		
		//generirane na hrastcheta
		for(int i = 0; i < bushes; ){
			int bushIndexI = ran.nextInt(23) + 1;
			int bushIndexJ = ran.nextInt(48) + 1;
			if(rockIndexI != bushIndexI && rockIndexJ != bushIndexJ){
				ring[bushIndexI][bushIndexJ] = '*';
				i++;
			}
		}
		
		// generirane nafinal na igrata
		ring[23][48] = 'F';
		
		//generirane na chovecheto
		int manIndexI = 1;
		int manIndexJ = 1;
		ring[manIndexI][manIndexJ] = 'P';
		
		char movement;
		
		System.out.println("Let's begin! GOOD LUCK!!!");
		while(true){
			printRing(ring);
			System.out.println("Where to move now?");
			movement = sc.next().charAt(0);
			switch (movement) {
			
			case 'd':
				manIndexJ++;
				if(gameOver(ring, manIndexI, manIndexJ)){
					break;
				}
				if(manIndexI == rockIndexI && manIndexJ == rockIndexJ){
					rockIndexJ++;
					if(gameOver(ring, rockIndexI, rockIndexJ)){
						break;
					}
					else{
						moveRightRock(ring, rockIndexI, rockIndexJ);
					}
				}
		
				moveRight(ring, manIndexI, manIndexJ);
				
				
				break;
			case 'a':
				manIndexJ--;
				if(gameOver(ring, manIndexI, manIndexJ)){
					break;
				}
				if(manIndexI == rockIndexI && manIndexJ == rockIndexJ){
					rockIndexJ--;
					if(gameOver(ring, rockIndexI, rockIndexJ)){
						break;
					}
					else{
						moveLeftRock(ring, rockIndexI, rockIndexJ);
					}
				}
		
				moveLeft(ring, manIndexI, manIndexJ);
				break;
			case 's':
				manIndexI++;
				if(gameOver(ring, manIndexI, manIndexJ)){
					break;
				}
				if(manIndexI == rockIndexI && manIndexJ == rockIndexJ){
					rockIndexI++;
					if(gameOver(ring, rockIndexI, rockIndexJ)){
						break;
					}
					else{
						moveDownRock(ring, rockIndexI, rockIndexJ);
					}
				}
		
				moveDown(ring, manIndexI, manIndexJ);
				break;
			case 'w':
				manIndexI--;
				if(gameOver(ring, manIndexI, manIndexJ)){
					break;
				}
				if(manIndexI == rockIndexI && manIndexJ == rockIndexJ){
					rockIndexI--;
					if(gameOver(ring, rockIndexI, rockIndexJ)){
						break;
					}
					else{
						moveUpRock(ring, rockIndexI, rockIndexJ);
					}
				}
		
				moveUp(ring, manIndexI, manIndexJ);
				break;

			default:
				System.out.println("Enter direction again!");
			}
			if(ring[23][48] == 'X'){
				System.out.println("YOU WON! GONGRATS!!!");
				break;
			}
			if (gameOver(ring, manIndexI, manIndexJ) || gameOver(ring, rockIndexI, rockIndexJ)) {
				System.out.println("GAME OVER!");
				break;
			}
			
		}
		
	}
	
	static void printRing(char[][] ring){
		for(int i = 0; i < 25; i++){
			for(int j = 0; j < 50; j++){
				System.out.print(ring[i][j]);
			}
			System.out.println();
		}
	}
	static void moveRight(char[][] ring, int manIndexI, int manIndexJ){
		ring[manIndexI][manIndexJ - 1] = ' ';
		ring[manIndexI][manIndexJ] = 'P';
	}
	static void moveLeft(char[][] ring, int manIndexI, int manIndexJ){
		ring[manIndexI][manIndexJ + 1] = ' ';
		ring[manIndexI][manIndexJ] = 'P';
	}
	static void moveDown(char[][] ring, int manIndexI, int manIndexJ){
		ring[manIndexI - 1][manIndexJ] = ' ';
		ring[manIndexI][manIndexJ] = 'P';
	}
	static void moveUp(char[][] ring, int manIndexI, int manIndexJ){
		ring[manIndexI + 1][manIndexJ] = ' ';
		ring[manIndexI][manIndexJ] = 'P';
	}
	static boolean gameOver(char[][] ring, int manIndexI, int manIndexJ){
		if(ring[manIndexI][manIndexJ] == '?' || ring[manIndexI][manIndexJ] == '*'){
			return true;
		}
		else{
			return false;
		}
	}
	
	static void moveRightRock(char[][] ring, int rockIndexI, int rockIndexJ){
		ring[rockIndexI][rockIndexJ - 1] = ' ';
		ring[rockIndexI][rockIndexJ] = 'X';
	}
	static void moveLeftRock(char[][] ring, int rockIndexI, int rockIndexJ){
		ring[rockIndexI][rockIndexJ + 1] = ' ';
		ring[rockIndexI][rockIndexJ] = 'X';
	}
	static void moveDownRock(char[][] ring, int rockIndexI, int rockIndexJ){
		ring[rockIndexI - 1][rockIndexJ] = ' ';
		ring[rockIndexI][rockIndexJ] = 'X';
	}
	static void moveUpRock(char[][] ring, int rockIndexI, int rockIndexJ){
		ring[rockIndexI + 1][rockIndexJ] = ' ';
		ring[rockIndexI][rockIndexJ] = 'X';
	
	
	}
}
