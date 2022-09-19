package FixtureBuilder;


public class Main {
	public static void main(String[] args) {
        Team teams = new Team();

        teams.addTeam("Galatasaray");
        teams.addTeam("Fenerbahçe");
        teams.addTeam("Beþiktaþ");
        teams.addTeam("Karþýyaka");
        

        teams.run();
    }
}