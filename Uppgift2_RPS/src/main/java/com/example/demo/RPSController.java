package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RPSController {

	// Metod där en spelare kan möta en annan spelare.
	@RequestMapping(value = "/pvp", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String pvp(@RequestParam String player1, @RequestParam String player2) {

		String winner = CheckWin.checkWinPvp(player1, player2);

		String pattern = "{ \"Player1\":\"%s\", \"Player2\":\"%s\", \"Winner\":\"%s\"}";

		return String.format(pattern, player1, player2, winner);
	}
	
	// En POST metod där man kan kolla statestik för ens matcher. 
	// Finns ett html dokument under "/resources/templates/index.html".
	@RequestMapping(value = "/statisticsPvp", method = RequestMethod.POST)
	public String showStatisticsPvp() {
		return RPSBean.statisticsPvp();
	}
	
	// Metod där man kan möta datorn.
	@RequestMapping(value = "/pve", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String pve(@RequestParam String player1, @RequestParam int rounds) {
		
		return MakeJSON.makePveJSON(player1, rounds);
	}
	
	// En POST metod där man kan kolla statestik för ens matcher. 
	// Finns ett html dokument under "/resources/templates/index.html".
	@RequestMapping(value = "statisticsPve", method = RequestMethod.POST)
	public String showStatisticsPve() {
		return RPSBean.statisticsPve();
	}
}
