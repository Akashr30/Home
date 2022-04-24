package com.snakeAndLadderGame;

import java.util.ArrayList;
import java.util.Random;

import com.snakeAndLadder.models.Ladder;
import com.snakeAndLadder.models.Player;
import com.snakeAndLadder.models.SnakeAndLadderBoard;
import com.snakeAndLadder.models.Snakes;

public class SnakeAndLadderService {
	
	private ArrayList<Player> player;
	private ArrayList<Snakes> snake;
	private ArrayList<Ladder> ladder;
	private SnakeAndLadderBoard snakeAndLadderBoard;
	static int boardSize = 100;
	
	public SnakeAndLadderBoard getSnakeAndLadderBoard() {
		return snakeAndLadderBoard;
	}

	public void setSnakeAndLadderBoard(SnakeAndLadderBoard snakeAndLadderBoard) {
		this.snakeAndLadderBoard = snakeAndLadderBoard;
	}

	public ArrayList<Player> getPlayer() {
		return player;
	}

	public void setPlayer(ArrayList<Player> player) {
		this.player = player;
	}

	public ArrayList<Snakes> getSnake() {
		return snake;
	}

	public void setSnake(ArrayList<Snakes> snake) {
		this.snake = snake;
	}

	public ArrayList<Ladder> getLadder() {
		return ladder;
	}

	public void setLadder(ArrayList<Ladder> ladder) {
		this.ladder = ladder;
	}
	
	private int rollTheDice() {
		
		int max = 6;
		return (int) (Math.random()*max)+1;
	}

	public void startGame() {
		
		while (player.size() > 0 &&player.get(0).getPlayerPosition() < boardSize) {
			int diceValue = rollTheDice();
			player.get(0).setPlayerPosition(movePlayer(diceValue,player.get(0)));
			Player temp = player.get(0);
			player.remove(0);
			player.add(temp);
			if (player.get(0).getPlayerPosition() >= boardSize) {
				System.out.println("Game over for the player "+player.get(0).getPlayerId());
				player.remove(0);
			}
		}
		
		
	}
	
	public int movePlayer(int diceVal , Player player) {
		
		int newPlayerPosition = player.getPlayerPosition()+diceVal;
		int onSnakePosition = isNewPlayerPositionIsOnSnake(newPlayerPosition);
		int onLadderPosition = isNewPlayerPositionIsOnLadder(newPlayerPosition);
		boolean flag = true;
		if( onSnakePosition > 0) {
			int tempVal = player.getPlayerPosition();
			newPlayerPosition = onSnakePosition;
			System.out.println(" Player previous position at  "+player.getPlayerPosition());
			System.out.println(" rolled Dice value is  "+diceVal);
			System.out.println(player.getPlayerId()+" was swallowed by a snake at "+tempVal);
			flag = false;
			return newPlayerPosition;
		} 
		
		if ( onLadderPosition > 0) {
			int tempVal = player.getPlayerPosition();
			newPlayerPosition = isNewPlayerPositionIsOnLadder(newPlayerPosition);
			System.out.println(" Player previous position at  "+player.getPlayerPosition());
			System.out.println(" rolled Dice value is  "+diceVal);
			System.out.println(player.getPlayerId()+" climbs the ladder from"+tempVal+" to "+newPlayerPosition);
			flag = false;
			return newPlayerPosition;
		}
		
		if (flag) {
			System.out.println(player.getPlayerId()+" moved from position "+player.getPlayerPosition() +" to "+ newPlayerPosition);
		}
		
		return newPlayerPosition;
	}
	
	private int isNewPlayerPositionIsOnSnake(int newPlayerPosition) {
		
		for (int i = 0 ; i < snake.size() ; i++) {
			if (newPlayerPosition == snake.get(i).getStartPoint()) {
				return snake.get(i).getEndPoint(); 
			}
		}
		return 0;
	}
	
	private int isNewPlayerPositionIsOnLadder(int newPlayerPosition) {
		
		for (int i = 0; i < ladder.size() ; i++) {
			if (newPlayerPosition ==  ladder.get(i).getStartPoint()) {
				return ladder.get(i).getEndPoint(); 
			}
		}
		
		return 0;
	}

}
