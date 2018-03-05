package com.example.demo.entity;

public class member {
    private int id;
    private String name;
    private String number;
    private String teamID;

    public member(){

    }
    public member(int id, String name, String number, String teamID) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.teamID = teamID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }
}
