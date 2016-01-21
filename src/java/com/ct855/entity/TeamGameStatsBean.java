package com.ct855.entity;

public class TeamGameStatsBean {
    private int StatID;
    private int TeamID;
    private int SeasonType;
    private int Season;
    private String Name;
    private String Team;
    private int Wins;
    private int Losses;
    private String Updated;
    private int Games;
    private int FantasyPoints;
    private float Minutes;
    private int FieldGoalsMade;
    private int FieldGoalsAttempted;
    private float FieldGoalsPercentage;
    private float EffectiveFieldGoalsPercentage;
    private int TwoPointersMade;
    private int TwoPointersAttempted;
    private float TwoPointersPercentage;
    private int ThreePointersMade;
    private int ThreePointersAttempted;
    private float ThreePointersPercentage;
    private int FreeThrowsMade;
    private int FreeThrowsAttempted;
    private float FreeThrowsPercentage;
    private int OffensiveRebounds;
    private int DefensiveRebounds;
    private int Rebounds;
    private int OffensiveReboundsPercentage;
    private int DefensiveReboundsPercentage;
    private int TotalReboundsPercentage;
    private int Assists;
    private int Steals;
    private int BlockedShots;
    private int Turnovers;
    private int PersonalFouls;
    private int Points;
    private int TrueShootingAttempts;
    private int TrueShootingPercentage;
    private float PlayerEfficiencyRating;
    private float AssistsPercentage;
    private float StealsPercentage;
    private float BlocksPercentage;
    private float TurnOversPercentage;
    private float UsageRatePercentage;
    private float FantasyPointsFanDuel;
    private float FantasyPointsDraftKings;
    private float FantasyPointsYahoo;

    private int GameID;
    private int OpponentID;  //对手id
    private String Opponent;  //对手
    private String Day;
    private String DateTime;
    private String HomeOrAway;
    private boolean IsGameOver;
    public int getStatID() {
        return StatID;
    }

    public void setStatID(int StatID) {
        this.StatID = StatID;
    }

    public int getTeamID() {
        return TeamID;
    }

    public void setTeamID(int TeamID) {
        this.TeamID = TeamID;
    }

    public int getSeasonType() {
        return SeasonType;
    }

    public void setSeasonType(int SeasonType) {
        this.SeasonType = SeasonType;
    }

    public int getSeason() {
        return Season;
    }

    public void setSeason(int Season) {
        this.Season = Season;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String Team) {
        this.Team = Team;
    }

    public int getWins() {
        return Wins;
    }

    public void setWins(int Wins) {
        this.Wins = Wins;
    }

    public int getLosses() {
        return Losses;
    }

    public void setLosses(int Losses) {
        this.Losses = Losses;
    }

    public String getUpdated() {
        return Updated;
    }

    public void setUpdated(String Updated) {
        this.Updated = Updated;
    }

    public int getGames() {
        return Games;
    }

    public void setGames(int Games) {
        this.Games = Games;
    }

    public int getFantasyPoints() {
        return FantasyPoints;
    }

    public void setFantasyPoints(int FantasyPoints) {
        this.FantasyPoints = FantasyPoints;
    }

    public float getMinutes() {
        return Minutes;
    }

    public void setMinutes(float Minutes) {
        this.Minutes = Minutes;
    }

    public int getFieldGoalsMade() {
        return FieldGoalsMade;
    }

    public void setFieldGoalsMade(int FieldGoalsMade) {
        this.FieldGoalsMade = FieldGoalsMade;
    }

    public int getFieldGoalsAttempted() {
        return FieldGoalsAttempted;
    }

    public void setFieldGoalsAttempted(int FieldGoalsAttempted) {
        this.FieldGoalsAttempted = FieldGoalsAttempted;
    }

    public float getFieldGoalsPercentage() {
        return FieldGoalsPercentage;
    }

    public void setFieldGoalsPercentage(float FieldGoalsPercentage) {
        this.FieldGoalsPercentage = FieldGoalsPercentage;
    }

    public float getEffectiveFieldGoalsPercentage() {
        return EffectiveFieldGoalsPercentage;
    }

    public void setEffectiveFieldGoalsPercentage(float EffectiveFieldGoalsPercentage) {
        this.EffectiveFieldGoalsPercentage = EffectiveFieldGoalsPercentage;
    }

    public int getTwoPointersMade() {
        return TwoPointersMade;
    }

    public void setTwoPointersMade(int TwoPointersMade) {
        this.TwoPointersMade = TwoPointersMade;
    }

    public int getTwoPointersAttempted() {
        return TwoPointersAttempted;
    }

    public void setTwoPointersAttempted(int TwoPointersAttempted) {
        this.TwoPointersAttempted = TwoPointersAttempted;
    }

    public float getTwoPointersPercentage() {
        return TwoPointersPercentage;
    }

    public void setTwoPointersPercentage(float TwoPointersPercentage) {
        this.TwoPointersPercentage = TwoPointersPercentage;
    }

    public int getThreePointersMade() {
        return ThreePointersMade;
    }

    public void setThreePointersMade(int ThreePointersMade) {
        this.ThreePointersMade = ThreePointersMade;
    }

    public int getThreePointersAttempted() {
        return ThreePointersAttempted;
    }

    public void setThreePointersAttempted(int ThreePointersAttempted) {
        this.ThreePointersAttempted = ThreePointersAttempted;
    }

    public float getThreePointersPercentage() {
        return ThreePointersPercentage;
    }

    public void setThreePointersPercentage(float ThreePointersPercentage) {
        this.ThreePointersPercentage = ThreePointersPercentage;
    }

    public int getFreeThrowsMade() {
        return FreeThrowsMade;
    }

    public void setFreeThrowsMade(int FreeThrowsMade) {
        this.FreeThrowsMade = FreeThrowsMade;
    }

    public int getFreeThrowsAttempted() {
        return FreeThrowsAttempted;
    }

    public void setFreeThrowsAttempted(int FreeThrowsAttempted) {
        this.FreeThrowsAttempted = FreeThrowsAttempted;
    }

    public float getFreeThrowsPercentage() {
        return FreeThrowsPercentage;
    }

    public void setFreeThrowsPercentage(float FreeThrowsPercentage) {
        this.FreeThrowsPercentage = FreeThrowsPercentage;
    }

    public int getOffensiveRebounds() {
        return OffensiveRebounds;
    }

    public void setOffensiveRebounds(int OffensiveRebounds) {
        this.OffensiveRebounds = OffensiveRebounds;
    }

    public int getDefensiveRebounds() {
        return DefensiveRebounds;
    }

    public void setDefensiveRebounds(int DefensiveRebounds) {
        this.DefensiveRebounds = DefensiveRebounds;
    }

    public int getRebounds() {
        return Rebounds;
    }

    public void setRebounds(int Rebounds) {
        this.Rebounds = Rebounds;
    }

    public int getOffensiveReboundsPercentage() {
        return OffensiveReboundsPercentage;
    }

    public void setOffensiveReboundsPercentage(int OffensiveReboundsPercentage) {
        this.OffensiveReboundsPercentage = OffensiveReboundsPercentage;
    }

    public int getDefensiveReboundsPercentage() {
        return DefensiveReboundsPercentage;
    }

    public void setDefensiveReboundsPercentage(int DefensiveReboundsPercentage) {
        this.DefensiveReboundsPercentage = DefensiveReboundsPercentage;
    }

    public int getTotalReboundsPercentage() {
        return TotalReboundsPercentage;
    }

    public void setTotalReboundsPercentage(int TotalReboundsPercentage) {
        this.TotalReboundsPercentage = TotalReboundsPercentage;
    }

    public int getAssists() {
        return Assists;
    }

    public void setAssists(int Assists) {
        this.Assists = Assists;
    }

    public int getSteals() {
        return Steals;
    }

    public void setSteals(int Steals) {
        this.Steals = Steals;
    }

    public int getBlockedShots() {
        return BlockedShots;
    }

    public void setBlockedShots(int BlockedShots) {
        this.BlockedShots = BlockedShots;
    }

    public int getTurnovers() {
        return Turnovers;
    }

    public void setTurnovers(int Turnovers) {
        this.Turnovers = Turnovers;
    }

    public int getPersonalFouls() {
        return PersonalFouls;
    }

    public void setPersonalFouls(int PersonalFouls) {
        this.PersonalFouls = PersonalFouls;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int Points) {
        this.Points = Points;
    }

    public int getTrueShootingAttempts() {
        return TrueShootingAttempts;
    }

    public void setTrueShootingAttempts(int TrueShootingAttempts) {
        this.TrueShootingAttempts = TrueShootingAttempts;
    }

    public int getTrueShootingPercentage() {
        return TrueShootingPercentage;
    }

    public void setTrueShootingPercentage(int TrueShootingPercentage) {
        this.TrueShootingPercentage = TrueShootingPercentage;
    }

    public float getPlayerEfficiencyRating() {
        return PlayerEfficiencyRating;
    }

    public void setPlayerEfficiencyRating(float PlayerEfficiencyRating) {
        this.PlayerEfficiencyRating = PlayerEfficiencyRating;
    }

    public float getAssistsPercentage() {
        return AssistsPercentage;
    }

    public void setAssistsPercentage(float AssistsPercentage) {
        this.AssistsPercentage = AssistsPercentage;
    }

    public float getStealsPercentage() {
        return StealsPercentage;
    }

    public void setStealsPercentage(float StealsPercentage) {
        this.StealsPercentage = StealsPercentage;
    }

    public float getBlocksPercentage() {
        return BlocksPercentage;
    }

    public void setBlocksPercentage(float BlocksPercentage) {
        this.BlocksPercentage = BlocksPercentage;
    }

    public float getTurnOversPercentage() {
        return TurnOversPercentage;
    }

    public void setTurnOversPercentage(float TurnOversPercentage) {
        this.TurnOversPercentage = TurnOversPercentage;
    }

    public float getUsageRatePercentage() {
        return UsageRatePercentage;
    }

    public void setUsageRatePercentage(float UsageRatePercentage) {
        this.UsageRatePercentage = UsageRatePercentage;
    }

    public float getFantasyPointsFanDuel() {
        return FantasyPointsFanDuel;
    }

    public void setFantasyPointsFanDuel(float FantasyPointsFanDuel) {
        this.FantasyPointsFanDuel = FantasyPointsFanDuel;
    }

    public float getFantasyPointsDraftKings() {
        return FantasyPointsDraftKings;
    }

    public void setFantasyPointsDraftKings(float FantasyPointsDraftKings) {
        this.FantasyPointsDraftKings = FantasyPointsDraftKings;
    }

    public float getFantasyPointsYahoo() {
        return FantasyPointsYahoo;
    }

    public void setFantasyPointsYahoo(float FantasyPointsYahoo) {
        this.FantasyPointsYahoo = FantasyPointsYahoo;
    }

}
