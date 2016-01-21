package com.ct855.entity;
/*
-- Create table
create table PLAYER
(
  playerid         NUMBER not null,
  sportsdataid     NUMBER,
  active           NUMBER,
  teamid           NUMBER,
  team             VARCHAR2(20),
  jersey           NUMBER,
  positioncategory VARCHAR2(20),
  position         VARCHAR2(20),
  firstname        VARCHAR2(20),
  lastname         VARCHAR2(20),
  height           NUMBER,
  weight           NUMBER,
  birthdate        VARCHAR2(30),
  birthcity        VARCHAR2(30),
  birthstate       VARCHAR2(30),
  birthcountry     VARCHAR2(20),
  highschool       VARCHAR2(20),
  college          VARCHAR2(20),
  salary           NUMBER,
  photourl         VARCHAR2(80),
  experience       NUMBER
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
alter table PLAYER
  add constraint PK_PLAYERID primary key (PLAYERID)
  using index 
  tablespace OP_TBS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );*/
public class PlayerBean {
    private Long playerID;
    private Long sportsDataID;
    private boolean active;
    private int teamID;
    private String team;
    private int jersey;        //球衣号码
    private String positionCategory;  //位置类型
    private String position;    //位置
    private String firstName;
    private String lastName;
    private float height;
    private float weight;
    private String birthDate;
    private String birthCity;
    private String birthState;
    private String birthCountry;
    private String highSchool;
    private String college;
    private float salary;
    private String photoUrl;
    private int experience;  //经验

    public Long getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Long playerID) {
        this.playerID = playerID;
    }

    public Long getSportsDataID() {
        return sportsDataID;
    }

    public void setSportsDataID(Long sportsDataID) {
        this.sportsDataID = sportsDataID;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getJersey() {
        return jersey;
    }

    public void setJersey(int jersey) {
        this.jersey = jersey;
    }

    public String getPositionCategory() {
        return positionCategory;
    }

    public void setPositionCategory(String positionCategory) {
        this.positionCategory = positionCategory;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getBirthState() {
        return birthState;
    }

    public void setBirthState(String birthState) {
        this.birthState = birthState;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
   
}
