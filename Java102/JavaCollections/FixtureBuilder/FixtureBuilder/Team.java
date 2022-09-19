package FixtureBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Team {
    private List<String> teams = new ArrayList<>();
    private int numberOfTeams = 0;
    private int numberOfRounds = 0;
    private Random ran = new Random();
    

    void run(){
        if(numberOfTeams == 0){
            System.out.println("Lütfen takým giriniz.");
        }else{

            if(numberOfTeams%2==1){
                teams.add("Bay");
                numberOfTeams++;
            }
            mix(ran.nextInt(5));
            matchmaker();
        }
    }
    void matchmaker(){

        for(int a=0;a<numberOfTeams/2+1;a++){
            numberOfRounds++;
            System.out.println();
            System.out.println("Round : "+numberOfRounds);
            System.out.println();
            
            for(int i=0;i<numberOfTeams/2;i++){
                System.out.println(teams.get(i)+" - "+teams.get(i+2));
                String value = teams.get(1);
                teams.remove(1);
                teams.add(value);
            }

        }
        for(int a=0;a<numberOfTeams/2+1;a++){
            numberOfRounds++;
            System.out.println();
            System.out.println("Round : "+numberOfRounds);
            System.out.println();
            
            for(int i=0;i<numberOfTeams/2;i++){
                System.out.println(teams.get(i+2)+" - "+teams.get(i));
                String value = teams.get(1);
                teams.remove(1);
                teams.add(value);
            }

        }

    }
    void mix(int mix){
        int sayi = ran.nextInt(mix);
        for(int i=0;i<sayi;i++){
            int random = ran.nextInt(numberOfTeams);
            String value = teams.get(random);
            teams.remove(random);
            teams.add(value);
        }
    }
    void addTeam(String teamName){
        teams.add(teamName);
        numberOfTeams++;
    }
}