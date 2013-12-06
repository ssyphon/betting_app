package datastructures;

import datastructures.Team;

public class Card {
	String team1;
	String team2;
	String teamColor1;
	String teamColor2;
	String topic;
	
	Card(Team team1, Team team2) {
		this.team1 = team1.name;
		this.team2 = team2.name;
		this.teamColor1 = team1.color;
		this.teamColor2 = team2.color;
	}
}
