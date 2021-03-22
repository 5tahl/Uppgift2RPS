package com.example.demo;

public class RPSBean {
	
	// Räknar vinnster/förluster/likas.
	private static int player1Wins;
	private static int player2Wins;
	private static int ties;
	
	private static int playerWins;
	private static int NpcWins;
	private static int pveTies;
	
	public static void addWinPlayer1() {
		player1Wins++;
	}
	public static void addWinPlayer2() {
		player2Wins++;
	}
	public static void addTie() {
		ties++;
	}
	
	public static void addWinPlayer() {
		playerWins++;
	}
	public static void addWinNpc() {
		NpcWins++;
	}
	public static void addPveTie() {
		pveTies++;
	}
	
	public static String statisticsPvp() {
		return "Player1 Wins: " + player1Wins + ". Player2 Wins: " + player2Wins + ". Ties: " + ties;
	}
	public static String statisticsPve() {
		return "Player Wins: " + playerWins + ". Npc Wins: " + NpcWins + ". Ties: " + pveTies;
	}
	
}
