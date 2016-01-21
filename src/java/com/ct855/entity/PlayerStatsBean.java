/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.entity;

/**
 * @author rain
 */
public class PlayerStatsBean {
    private Long statID;
    private Long teamID;
    private Long playerID;
    private int seasonType;
    private Long season;
    private String name;
    private String team;
    private String position;   //位置
    private int started;       //首发
    private String Updated;
    private Long games;                     //比赛场次
    private float fantasyPoints;
    private Long minutes;
    private Long fieldGoalsMade;             //投中次数
    private Long fieldGoalsAttempted;        //投球次数
    private float fieldGoalsPercentage;     //命中率
    private float effectiveFieldGoalsPercentage;  //有效区域得分比
    private Long twoPointersMade;            //两份投中个数
    private Long twoPointersAttempted;    //两分投篮次数
    private float twoPointersPercentage;   //两分命中率
    private Long threePointersMade;
    private Long threePointersAttempted;
    private float threePointersPercentage;
    private Long freeThrowsMade;           //罚中次数
    private Long freeThrowsAttempted;      //罚篮次数
    private float freeThrowsPercentage;    //罚篮命中率
    private Long offensiveRebounds;         //前场篮板
    private Long defensiveRebounds;          //后场篮板
    private Long rebounds;                  //篮板
    private Long assists;                    //助攻
    private Long steals;                     //抢断
    private Long blockedShots;               //盖帽
    private Long turnovers;                   //失误
    private Long personalFouls;              //犯规
    private Long points;                     //得分
    private float trueShootingAttempts;     //真是投篮次数
    private float trueShootingPercentage;   //投篮命中率
    private float fantasyPointsFanDuel;
    private float fantasyPointsDraftKings;
    private float fantasyPointsYahoo;

    //场均
    private float averagePoint;
    private float averageRebounds;
    private float averageAssists;
    private float averageSteals;

    public float getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(float averagePoint) {
        this.averagePoint = averagePoint;
    }

    public float getAverageRebounds() {
        return averageRebounds;
    }

    public void setAverageRebounds(float averageRebounds) {
        this.averageRebounds = averageRebounds;
    }

    public float getAverageAssists() {
        return averageAssists;
    }

    public void setAverageAssists(float averageAssists) {
        this.averageAssists = averageAssists;
    }

    public float getAverageSteals() {
        return averageSteals;
    }

    public void setAverageSteals(float averageSteals) {
        this.averageSteals = averageSteals;
    }

    public float getAverageBlockedShots() {
        return averageBlockedShots;
    }

    public void setAverageBlockedShots(float averageBlockedShots) {
        this.averageBlockedShots = averageBlockedShots;
    }

    public float getAverageTurnovers() {
        return averageTurnovers;
    }

    public void setAverageTurnovers(float averageTurnovers) {
        this.averageTurnovers = averageTurnovers;
    }

    public float getAveragePersonalFouls() {
        return averagePersonalFouls;
    }

    public void setAveragePersonalFouls(float averagePersonalFouls) {
        this.averagePersonalFouls = averagePersonalFouls;
    }
    private float averageBlockedShots;
    private float averageTurnovers;
    private float averagePersonalFouls;
    
    
    public Long getStatID() {
        return statID;
    }

    public void setStatID(Long statID) {
        this.statID = statID;
    }

    public Long getTeamID() {
        return teamID;
    }

    public void setTeamID(Long teamID) {
        this.teamID = teamID;
    }

    public Long getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Long playerID) {
        this.playerID = playerID;
    }

    public int getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(int seasonType) {
        this.seasonType = seasonType;
    }

    public Long getSeason() {
        return season;
    }

    public void setSeason(Long season) {
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStarted() {
        return started;
    }

    public void setStarted(int started) {
        this.started = started;
    }

    public String getUpdated() {
        return Updated;
    }

    public void setUpdated(String Updated) {
        this.Updated = Updated;
    }

    public Long getGames() {
        return games;
    }

    public void setGames(Long games) {
        this.games = games;
    }

    public float getFantasyPoints() {
        return fantasyPoints;
    }

    public void setFantasyPoints(float fantasyPoints) {
        this.fantasyPoints = fantasyPoints;
    }

    public Long getMinutes() {
        return minutes;
    }

    public void setMinutes(Long minutes) {
        this.minutes = minutes;
    }

    public Long getFieldGoalsMade() {
        return fieldGoalsMade;
    }

    public void setFieldGoalsMade(Long fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade;
    }

    public Long getFieldGoalsAttempted() {
        return fieldGoalsAttempted;
    }

    public void setFieldGoalsAttempted(Long fieldGoalsAttempted) {
        this.fieldGoalsAttempted = fieldGoalsAttempted;
    }

    public float getFieldGoalsPercentage() {
        return fieldGoalsPercentage;
    }

    public void setFieldGoalsPercentage(float fieldGoalsPercentage) {
        this.fieldGoalsPercentage = fieldGoalsPercentage;
    }

    public float getEffectiveFieldGoalsPercentage() {
        return effectiveFieldGoalsPercentage;
    }

    public void setEffectiveFieldGoalsPercentage(float effectiveFieldGoalsPercentage) {
        this.effectiveFieldGoalsPercentage = effectiveFieldGoalsPercentage;
    }

    public Long getTwoPointersMade() {
        return twoPointersMade;
    }

    public void setTwoPointersMade(Long twoPointersMade) {
        this.twoPointersMade = twoPointersMade;
    }

    public Long getTwoPointersAttempted() {
        return twoPointersAttempted;
    }

    public void setTwoPointersAttempted(Long twoPointersAttempted) {
        this.twoPointersAttempted = twoPointersAttempted;
    }

    public float getTwoPointersPercentage() {
        return twoPointersPercentage;
    }

    public void setTwoPointersPercentage(float twoPointersPercentage) {
        this.twoPointersPercentage = twoPointersPercentage;
    }

    public Long getThreePointersMade() {
        return threePointersMade;
    }

    public void setThreePointersMade(Long threePointersMade) {
        this.threePointersMade = threePointersMade;
    }

    public Long getThreePointersAttempted() {
        return threePointersAttempted;
    }

    public void setThreePointersAttempted(Long threePointersAttempted) {
        this.threePointersAttempted = threePointersAttempted;
    }

    public float getThreePointersPercentage() {
        return threePointersPercentage;
    }

    public void setThreePointersPercentage(float threePointersPercentage) {
        this.threePointersPercentage = threePointersPercentage;
    }

    public Long getFreeThrowsMade() {
        return freeThrowsMade;
    }

    public void setFreeThrowsMade(Long freeThrowsMade) {
        this.freeThrowsMade = freeThrowsMade;
    }

    public Long getFreeThrowsAttempted() {
        return freeThrowsAttempted;
    }

    public void setFreeThrowsAttempted(Long freeThrowsAttempted) {
        this.freeThrowsAttempted = freeThrowsAttempted;
    }

    public float getFreeThrowsPercentage() {
        return freeThrowsPercentage;
    }

    public void setFreeThrowsPercentage(float freeThrowsPercentage) {
        this.freeThrowsPercentage = freeThrowsPercentage;
    }

    public Long getOffensiveRebounds() {
        return offensiveRebounds;
    }

    public void setOffensiveRebounds(Long offensiveRebounds) {
        this.offensiveRebounds = offensiveRebounds;
    }

    public Long getDefensiveRebounds() {
        return defensiveRebounds;
    }

    public void setDefensiveRebounds(Long defensiveRebounds) {
        this.defensiveRebounds = defensiveRebounds;
    }

    public Long getRebounds() {
        return rebounds;
    }

    public void setRebounds(Long rebounds) {
        this.rebounds = rebounds;
    }

    public Long getAssists() {
        return assists;
    }

    public void setAssists(Long assists) {
        this.assists = assists;
    }

    public Long getSteals() {
        return steals;
    }

    public void setSteals(Long steals) {
        this.steals = steals;
    }

    public Long getBlockedShots() {
        return blockedShots;
    }

    public void setBlockedShots(Long blockedShots) {
        this.blockedShots = blockedShots;
    }

    public Long getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(Long turnovers) {
        this.turnovers = turnovers;
    }

    public Long getPersonalFouls() {
        return personalFouls;
    }

    public void setPersonalFouls(Long personalFouls) {
        this.personalFouls = personalFouls;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public float getTrueShootingAttempts() {
        return trueShootingAttempts;
    }

    public void setTrueShootingAttempts(float trueShootingAttempts) {
        this.trueShootingAttempts = trueShootingAttempts;
    }

    public float getTrueShootingPercentage() {
        return trueShootingPercentage;
    }

    public void setTrueShootingPercentage(float trueShootingPercentage) {
        this.trueShootingPercentage = trueShootingPercentage;
    }

    public float getFantasyPointsFanDuel() {
        return fantasyPointsFanDuel;
    }

    public void setFantasyPointsFanDuel(float fantasyPointsFanDuel) {
        this.fantasyPointsFanDuel = fantasyPointsFanDuel;
    }

    public float getFantasyPointsDraftKings() {
        return fantasyPointsDraftKings;
    }

    public void setFantasyPointsDraftKings(float fantasyPointsDraftKings) {
        this.fantasyPointsDraftKings = fantasyPointsDraftKings;
    }

    public float getFantasyPointsYahoo() {
        return fantasyPointsYahoo;
    }

    public void setFantasyPointsYahoo(float fantasyPointsYahoo) {
        this.fantasyPointsYahoo = fantasyPointsYahoo;
    }
    
    public void setAverage(){
        if (games!=null) {
            if (points!=0) {
                this.averagePoint = points/games;
            }
            if (blockedShots!=0) {
                this.averageBlockedShots = blockedShots/games;
            }
            if (assists!=0) {
                this.averageAssists = assists/games;
            }
            if (rebounds!=0) {
                this.averageRebounds = rebounds/games;
            }
            if (steals!=0) {
                this.averageSteals = steals/games;
            }
            if (turnovers!=0) {
                this.averageTurnovers = turnovers/games;
            }
        }
        
    }
    
}
