package com.example.demo.entity;

import java.util.ArrayList;

public class team {
    private int id;
    private String teamName;
    private String leaderNumber;
    private ArrayList<member> members;

    public team(){

    }
    public team(int id, String teamName, String leaderNumber) {
        this.id = id;
        this.teamName = teamName;
        this.leaderNumber = leaderNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLeaderNumber() {
        return leaderNumber;
    }

    public void setLeaderNumber(String leaderNumber) {
        this.leaderNumber = leaderNumber;
    }

    public ArrayList<member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return id+ " "+teamName +" "+members.size();
    }
}
