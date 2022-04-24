package com.snakeAndLadderGame;

import java.util.ArrayList;
import java.util.Scanner;

import com.snakeAndLadder.models.Ladder;
import com.snakeAndLadder.models.Player;
import com.snakeAndLadder.models.Snakes;

public class Driver {
	
	public static void main(String[] ar) {
		
		Scanner sc = new Scanner(System.in);
		//create the players
		System.out.println("Enter the number of players :");
		int pl = Integer.parseInt(sc.nextLine());
		ArrayList<Player> player = new ArrayList<>();
		while (pl > 0) {
			player.add(new Player(sc.nextLine()));	// player created
			pl--;
		}
		//ENter the no of ladders needed
		int ladderCount = 2;
		System.out.println("Add ladders");
		ArrayList<Ladder> ladder = new ArrayList<>();	//Ladder created
		int i = 0;
		while (i < ladderCount) {		
			int start = Integer.parseInt(sc.nextLine());
			int end = Integer.parseInt(sc.nextLine());
			ladder.add(new Ladder(start,end));
			i++;
		}
		System.out.println("Add Snakes");
		int snakesCount = 2 ;
		ArrayList<Snakes> snakes = new ArrayList<>();	//Snakes created
		int j = 0;
		while (j < snakesCount) {
			int start = Integer.parseInt(sc.nextLine());
			int end = Integer.parseInt(sc.nextLine());
			snakes.add(new Snakes(start,end));
			j++;
		}
		
		SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();
		snakeAndLadderService.setSnake(snakes);
		snakeAndLadderService.setLadder(ladder);
		snakeAndLadderService.setPlayer(player);
		snakeAndLadderService.startGame();
	}
}
