package com.bohana;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    String name;
    ArrayList<T> players;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getTeamSize(){
        return players.size();
    }

    public ArrayList<T> getPlayers() {
        return players;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public boolean addPlayer(T player){
        if(players.contains(player)){
            System.out.println("Player is already in the team.");
            return false;
        }
        players.add(player);
        return true;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            ++this.won;
            ++opponent.lost;
        } else if(theirScore > ourScore){
            ++this.lost;
            ++opponent.won;
        } else{
            ++this.tied;
            ++opponent.tied;
        }
    }

    public int getRanking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> tTeam) {
        if(this.getRanking() > tTeam.getRanking()){
            return -1;
        } else if(this.getRanking() < tTeam.getRanking()){
            return 0;
        } else{
            return 1;
        }
    }
}
