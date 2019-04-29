package com.Sports.models;

public class Team {
    private String name;
    private String gender;
    private String captainRegNo;
    private String coachId;
    private int teamId;
    private int sportId;

    public Team(String name, String gender, String captainRegNo, String coachId, int teamId, int sportId) {
        this.name = name;
        this.gender = gender;
        this.captainRegNo = captainRegNo;
        this.coachId = coachId;
        this.teamId = teamId;
        this.sportId = sportId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCaptainRegNo() {
        return captainRegNo;
    }

    public void setCaptainRegNo(String captainRegNo) {
        this.captainRegNo = captainRegNo;
    }

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getSportId() {
        return sportId;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }

    public boolean setCaptain(){
        return true;
    }
}