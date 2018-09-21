package com.bvo.androidflavorandobfuscation.model;

import java.util.List;

public class Club implements BaseClass{
    private String clubName;
    private String clubCountry;
    private int clubIcon;
    private List<Player> clubPlayers;
    private Coach clubCoach;

    public Club() {
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubCountry() {
        return clubCountry;
    }

    public void setClubCountry(String clubCountry) {
        this.clubCountry = clubCountry;
    }

    public int getClubIcon() {
        return clubIcon;
    }

    public void setClubIcon(int clubIcon) {
        this.clubIcon = clubIcon;
    }

    public List<Player> getClubPlayers() {
        return clubPlayers;
    }

    public void setClubPlayers(List<Player> clubPlayers) {
        this.clubPlayers = clubPlayers;
    }

    public Coach getClubCoach() {
        return clubCoach;
    }

    public void setClubCoach(Coach clubCoach) {
        this.clubCoach = clubCoach;
    }
}
