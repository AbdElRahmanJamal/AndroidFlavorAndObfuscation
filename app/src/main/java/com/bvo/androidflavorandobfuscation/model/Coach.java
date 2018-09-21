package com.bvo.androidflavorandobfuscation.model;

import java.util.List;

public class Coach implements BaseClass{
    private String CoachName;
    private String CoachNationality;
    private int CoachRank;
    private List<Player> CoachPlayers;
    private Club CoachClub;

    public Coach() {
    }

    public String getCoachName() {
        return CoachName;
    }

    public void setCoachName(String coachName) {
        CoachName = coachName;
    }

    public String getCoachNationality() {
        return CoachNationality;
    }

    public void setCoachNationality(String coachNationality) {
        CoachNationality = coachNationality;
    }

    public int getCoachRank() {
        return CoachRank;
    }

    public void setCoachRank(int coachRank) {
        CoachRank = coachRank;
    }

    public List<Player> getCoachPlayers() {
        return CoachPlayers;
    }

    public void setCoachPlayers(List<Player> coachPlayers) {
        CoachPlayers = coachPlayers;
    }

    public Club getCoachClub() {
        return CoachClub;
    }

    public void setCoachClub(Club coachClub) {
        CoachClub = coachClub;
    }
}
