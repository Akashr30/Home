package com.snakeAndLadder.models;

import java.util.UUID;

public class Player {
	
	private String playerId;
	private int position;
//	public final int position = 0;
	
	public Player(String name) {
		this.position = 0;
		this.setPlayerId(name);
	}
	
	public int getPlayerPosition() {
		return position;
	}

	public void setPlayerPosition(int playerPosition) {
		this.position = playerPosition;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	
}
