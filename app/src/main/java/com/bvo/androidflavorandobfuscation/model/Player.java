package com.bvo.androidflavorandobfuscation.model;

public class Player implements BaseClass{
    private String playerName;
    private String playerNationality;
    private int playerRank;
    private Coach playerCoach;
    private Club playerClub;

    public Player() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerNationality() {
        return playerNationality;
    }

    public void setPlayerNationality(String playerNationality) {
        this.playerNationality = playerNationality;
    }

    public int getPlayerRank() {
        return playerRank;
    }

    public void setPlayerRank(int playerRank) {
        this.playerRank = playerRank;
    }

    public Coach getPlayerCoach() {
        return playerCoach;
    }

    public void setPlayerCoach(Coach playerCoach) {
        this.playerCoach = playerCoach;
    }

    public Club getPlayerClub() {
        return playerClub;
    }

    public void setPlayerClub(Club playerClub) {
        this.playerClub = playerClub;
    }
}
