package com.ct855.entity;

public class GameBean {
/*
-- Create table
create table GAME
(
  gameid               NUMBER not null,
  season               NUMBER not null,
  seasontype           NUMBER not null,
  status               VARCHAR2(20) not null,
  day                  VARCHAR2(30) not null,
  datetime             VARCHAR2(40) not null,
  awayteam             VARCHAR2(20) not null,
  hometeam             VARCHAR2(20) not null,
  awayteamid           NUMBER not null,
  hometeamid           NUMBER not null,
  stadiumid            NUMBER,
  channel              VARCHAR2(30),
  attendance           VARCHAR2(20),
  awayteamscore        NUMBER,
  hometeamscore        NUMBER,
  updated              VARCHAR2(20),
  quarter              VARCHAR2(20),
  timeremainingminutes VARCHAR2(20),
  timeremainingseconds VARCHAR2(20),
  pointspread          NUMBER,
  overunder            NUMBER,
  awayteammoneyline    NUMBER,
  hometeammoneyline    NUMBER
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
alter table GAME
  add constraint PK_GAMEID primary key (GAMEID)
  disable;*/
	private Long gameId;
	private int season;
	private int seasonType; 
	private String status;
	private String day;
	private String dateTime;
	private String awayTeam;
	private String homeTeam;
	private int awayTeamID;
	private int homeTeamID;
	private int stadiumID;
	private String channel;   //频道
	private String attendance;  // 上座率
	private int awayTeamScore;
	private int homeTeamScore;
	private String updated;  //更新时间
	private String quarter;	 //第几节
	private String timeRemainingMinutes; //剩余分钟
	private String timeRemainingSeconds; // 剩余秒钟
	private float pointSpread;  //分差  让分
	private float overUnder;    //高过
	private float awayTeamMoneyLine;  //客队投注
	private float homeTeamMoneyLine;  //主队投注

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(int seasonType) {
        this.seasonType = seasonType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getAwayTeamID() {
        return awayTeamID;
    }

    public void setAwayTeamID(int awayTeamID) {
        this.awayTeamID = awayTeamID;
    }

    public int getHomeTeamID() {
        return homeTeamID;
    }

    public void setHomeTeamID(int homeTeamID) {
        this.homeTeamID = homeTeamID;
    }

    public int getStadiumID() {
        return stadiumID;
    }

    public void setStadiumID(int stadiumID) {
        this.stadiumID = stadiumID;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getTimeRemainingMinutes() {
        return timeRemainingMinutes;
    }

    public void setTimeRemainingMinutes(String timeRemainingMinutes) {
        this.timeRemainingMinutes = timeRemainingMinutes;
    }

    public String getTimeRemainingSeconds() {
        return timeRemainingSeconds;
    }

    public void setTimeRemainingSeconds(String timeRemainingSeconds) {
        this.timeRemainingSeconds = timeRemainingSeconds;
    }

    public float getPointSpread() {
        return pointSpread;
    }

    public void setPointSpread(float pointSpread) {
        this.pointSpread = pointSpread;
    }

    public float getOverUnder() {
        return overUnder;
    }

    public void setOverUnder(float overUnder) {
        this.overUnder = overUnder;
    }

    public float getAwayTeamMoneyLine() {
        return awayTeamMoneyLine;
    }

    public void setAwayTeamMoneyLine(float awayTeamMoneyLine) {
        this.awayTeamMoneyLine = awayTeamMoneyLine;
    }

    public float getHomeTeamMoneyLine() {
        return homeTeamMoneyLine;
    }

    public void setHomeTeamMoneyLine(float homeTeamMoneyLine) {
        this.homeTeamMoneyLine = homeTeamMoneyLine;
    }
	
	
}
