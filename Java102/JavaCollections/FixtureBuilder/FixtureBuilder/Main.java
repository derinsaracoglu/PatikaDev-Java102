package FixtureBuilder;


public class Main {
	public static void main(String[] args) {
        Team teams = new Team();

        teams.addTeam("Galatasaray");
        teams.addTeam("Fenerbah�e");
        teams.addTeam("Be�ikta�");
        teams.addTeam("Kar��yaka");
        

        teams.run();
    }
}