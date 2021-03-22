package com.example.demo;

import java.util.Random;

public class CheckWin {

	public static String checkWinPvp(String player1, String player2) {

		// Logiken bakom spelet.
		if ((player1.equals("rock")  && player2.equals("rock")) || (player1.equals("paper") && player2.equals("paper"))
				|| (player1.equals("scissor") && player2.equals("scissor"))) {
			RPSBean.addTie();
			return "Tie.";
		} else if ((player1.equals("rock") && player2.equals("paper")) || (player1.equals("paper") && player2.equals("scissor"))
				|| (player1.equals("scissor") && player2.equals("rock"))) {
			RPSBean.addWinPlayer2();
			return "Player 2 won.";
		} else if ((player1.equals("rock") && player2.equals("scissor")) || (player1.equals("paper") && player2.equals("rock"))
				|| (player1.equals("scissor") && player2.equals("paper"))) {
			RPSBean.addWinPlayer1();
			return "Player 1 won.";
		} 

		// Error hantering.
		return "Error. Choose between rock, paper or scissor.";
	}
	
	public static String checkWinNpc(String player, String random) {

		if ((player.equals("rock") && random.equals("rock")) || (player.equals("paper") && random.equals("paper"))
				|| (player.equals("scissor") && random.equals("scissor"))) {
			RPSBean.addPveTie();
			return "Tie.";
		} else if ((player.equals("rock") && random.equals("paper")) || (player.equals("paper") && random.equals("scissor"))
				|| (player.equals("scissor") && random.equals("rock"))) {
			RPSBean.addWinNpc();
			return "The npc won.";
		} else if ((player.equals("rock") && random.equals("scissor")) || (player.equals("paper") && random.equals("rock"))
				|| (player.equals("scissor") && random.equals("paper"))) {
			RPSBean.addWinPlayer();
			return "The player won.";
		}

		return "Error. Choose between rock, paper or scissor.";
	}
	
	// Slumpmässigt väljer rock/peper eller scissor.
	public static String randomRPS() {
		String[] RPS = { "rock", "paper", "scissor"};
		
		Random random = new Random();
		int randomNumber = random.nextInt(RPS.length);
		String rpsChoice = RPS[randomNumber];
		
		return rpsChoice;
	}
}
