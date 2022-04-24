package com.snakeAndLadder.models;

import java.util.ArrayList;

public class SnakeAndLadderBoard {
	
	private ArrayList<Ladder> ladders;
	private ArrayList<Snakes> snakes;
	private Player player;
	private int boardSize;
	
	public ArrayList<Ladder> getLadders() {
		return ladders;
	}
	public void setLadders(ArrayList<Ladder> ladders) {
		this.ladders = ladders;
	}
	public ArrayList<Snakes> getSnakes() {
		return snakes;
	}
	public void setSnakes(ArrayList<Snakes> snakes) {
		this.snakes = snakes;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public int getBoardSize() {
		return boardSize;
	}
	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}
	
	

}
