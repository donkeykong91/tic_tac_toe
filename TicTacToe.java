package com.practice.tictactoe;

import java.util.*;

public class TicTacToe {

	public static void main(String[] args) {
		Board board = new Board();
		
		System.out.println("Tic Tac Toe\n");
		

		try(Scanner cin = new Scanner(System.in)) {
			System.out.print("Please enter your name: ");
			Player player = new Player(cin.next());
			board.addPlayer(player);
			
			System.out.println("Thank you " + player.getName() + "!" + 
								"\nAre you ready to play!?" + "\n...");
			Thread.sleep(1000);
			System.out.println("...");
			Thread.sleep(1000);
			System.out.println("...");
			Thread.sleep(1000);
			System.out.println("...\n");
			Thread.sleep(1000);
			
			System.out.println("LET'S DO THIS!!!!!");
			
			while (true) {
				break;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Player {
	static int defaultName = 1;
	private String name;
	
	Player () {
		this.name = "player" + defaultName++;
	}
	
	Player (String name) {
		this.name = name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

class Board {
	private Set<Player> playerSet = new HashSet<Player>(); 
	
	public boolean nameTaken(Player player) {
		if (playerSet.contains(player.getName())) {return true;}
		return false;
	}
	
	public void addPlayer(Player player) {playerSet.add(player);}
}

class Score {
	private int score = 0;
	
	Score() {this.score = 0;}
	
	public int getScore() {return score;}
}

class ScoreComparator implements Comparator<Score> {
	public int compare (Score score1, Score score2) {
		if (score1.getScore() > score2.getScore()) {return -1;}
		else if (score1.getScore() < score2.getScore()) {return 1;}
		else {return 0;}
	}
}