package com.bohana;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    String name;
    ArrayList<T> teams;

    public String getName() {
        return name;
    }

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public boolean addTeam(T newTeam){
        if(teams.contains(newTeam)) {
            System.out.println("Team is already in the league.");
            return false;
        }
        teams.add(newTeam);
        return true;
    }

    public void printLeagueTable(){
        System.out.println("=====" + this.getName() + "=====");
        Collections.sort(teams);
        for(T t : teams){
            System.out.println(t.getName() + " scored " + t.getRanking() + " points, won " + t.getWon() + " matches, lost " + t.getLost() +
                    " and tied " + t.getTied());
        }
        System.out.println("=========================\n");
    }


}
