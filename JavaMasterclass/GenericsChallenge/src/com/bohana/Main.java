package com.bohana;

public class Main {

    public static void main(String[] args) {
	Team<SoccerPlayer> barcelona = new Team<>("Barcelona");
	Team<SoccerPlayer> realMadrid = new Team<>("Real Madrid");

	Team<CounterStrikePlayer> luminosityGaming = new Team<>("Luminosity Gaming");
	Team<CounterStrikePlayer> astralis = new Team<>("Astralis");

	League<Team<CounterStrikePlayer>> counterStrikeLeague = new League<>("Random Major Championship");
	League<Team<SoccerPlayer>> championsLeague = new League<>("Champions League");

	counterStrikeLeague.addTeam(luminosityGaming);
	counterStrikeLeague.addTeam(astralis);
	championsLeague.addTeam(barcelona);
	championsLeague.addTeam(realMadrid);

	//adding players to the teams
	luminosityGaming.addPlayer(new CounterStrikePlayer("Fallen", "AWP"));
        luminosityGaming.addPlayer(new CounterStrikePlayer("FNX", "AK-47"));

        astralis.addPlayer(new CounterStrikePlayer("dev1ce", "AWP"));
        astralis.addPlayer(new CounterStrikePlayer("xyp9x", "M4A1-S"));

        barcelona.addPlayer(new SoccerPlayer("Philippe Coutinho", 14));
        barcelona.addPlayer(new SoccerPlayer("Gerard Pique", 3));

        realMadrid.addPlayer(new SoccerPlayer("Vini Jr.", 20));
        realMadrid.addPlayer(new SoccerPlayer("Benzema", 9));

        //adding match results
        realMadrid.matchResult(barcelona, 3, 1);
        realMadrid.matchResult(barcelona, 2, 1);
        realMadrid.matchResult(barcelona, 3, 5);
        realMadrid.matchResult(barcelona, 1, 1);
        luminosityGaming.matchResult(astralis, 16, 14);
        luminosityGaming.matchResult(astralis, 16, 12);
        luminosityGaming.matchResult(astralis, 16, 16);
        luminosityGaming.matchResult(astralis, 13, 16);

        //print the results
        championsLeague.printLeagueTable();
        counterStrikeLeague.printLeagueTable();
    }
}
