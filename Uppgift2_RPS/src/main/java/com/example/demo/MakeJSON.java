package com.example.demo;

public class MakeJSON {

	// Gör om data till JSON.
	public static String makePveJSON(String player, int rounds) {

		String JSONtoSend = "{\"Rounds\": [";

		for (int i = 1; i <= rounds; i++) {

			String pattern = "{ \"Round\":\"%s\", \"Player\":\"%s\", \"NPC\":\"%s\", \"Who won\":\"%s\"}";
			String random = CheckWin.randomRPS();
			
			JSONtoSend += String.format(pattern, i, player,
					random, CheckWin.checkWinNpc(player, random));

			if (i < rounds) {
				JSONtoSend += ",";
			}
		}

		JSONtoSend += "]}";

		return JSONtoSend;
	}
}
