package com.ct855.entity;

public class TeamBean {

    /*
    -- Create table
create table TEAM
(
  teamid     LONG,
  key        VARCHAR2(20),
  active     INTEGER,
  city       VARCHAR2(40),
  name       VARCHAR2(20),
  stadiumid  NUMBER(10),
  conference VARCHAR2(20),
  division   VARCHAR2(20)
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

     */
    //队号  简写  是否存在  城市  名字  场馆  联盟  赛区
    private Long teamID;
    private String key;
    private boolean active;
    private String city;
    private String name;
    private Long stadiumId;
    private String conference;
    private String division;

    @Override
    public String toString() {
        return "TeamBean [TeamID=" + teamID + ", Key=" + key + ", Active="
                + active + ", City=" + city + ", Name=" + name + ", StadiumId="
                + stadiumId + ", Conference=" + conference + ", Division="
                + division + "]";
    }

    public Long getTeamID() {
        return teamID;
    }

    public void setTeamID(Long teamID) {
        this.teamID = teamID;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

    public Long getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(Long stadiumId) {
        this.stadiumId = stadiumId;
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

}
