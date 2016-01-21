package com.ct855.entity;
/*
-- Create table
create table STANDING
(
  season           NUMBER not null,
  seasontype       NUMBER not null,
  teamid           NUMBER not null,
  key              VARCHAR2(20),
  city             VARCHAR2(40),
  name             VARCHAR2(20),
  conference       VARCHAR2(30),
  division         VARCHAR2(30),
  wins             NUMBER,
  losses           NUMBER,
  percentage       NUMBER,
  conferencewins   NUMBER,
  conferencelosses NUMBER,
  divisionwins     NUMBER,
  divisionlosses   NUMBER
)
tablespace OP_TBS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate primary, unique and foreign key constraints 
alter table STANDING
  add constraint PK_STANDINGTEAMID primary key (TEAMID)
  disable;
*/
public class StandingBean {
    private Long season;
    private int seasonType;
    private int teamID;
    private String key;
    private String city;
    private String name;
    private String conference;
    private String division;
    private int wins;
    private int losses;
    private float percentage;
    private int conferenceWins;
    private int conferenceLosses;
    private int divisionWins;
    private int divisionLosses;

    public Long getSeason() {
        return season;
    }

    public void setSeason(Long season) {
        this.season = season;
    }

    public int getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(int seasonType) {
        this.seasonType = seasonType;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public int getConferenceWins() {
        return conferenceWins;
    }

    public void setConferenceWins(int conferenceWins) {
        this.conferenceWins = conferenceWins;
    }

    public int getConferenceLosses() {
        return conferenceLosses;
    }

    public void setConferenceLosses(int conferenceLosses) {
        this.conferenceLosses = conferenceLosses;
    }

    public int getDivisionWins() {
        return divisionWins;
    }

    public void setDivisionWins(int divisionWins) {
        this.divisionWins = divisionWins;
    }

    public int getDivisionLosses() {
        return divisionLosses;
    }

    public void setDivisionLosses(int divisionLosses) {
        this.divisionLosses = divisionLosses;
    }
   
}
