/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.entity;

/**
 *
 * @author USER
 */
public class BetRecords {

    /*
    playkey：彩種
BetTime：下注時間
list_id：玩法
TuiShuiType：彩種分類
——
GameType：彩種名 玩法-項目
BetPoinst：投注金額
CommRate：使用者的反點設置(lottery_rate)
MoneyMode：元角分厘
Note：注單編號
BetContent：投注號碼
mobile：是否為手機投注(0否,1是)

     */
    private Long MemberID;
    private String Account;
    private Long GameID;
    private Long BetLottoID;//投注資料，主索引id
    private Long RoundCode;
    private String buyid;//注單編號
    private String playkey;
    private String BetTime;
    private String list_id;
    private Long TuiShuiType;
    private String GameType;
    private Double BetPoinst;
    private Double CommRate;
    private String MoneyMode;
    private String Note;
    private String BetContent;
    private int mobile;
    private Long BetLogID;//主網投注單ID
    private int cancellotto;//是否撤单 0未撤1撤
    private double WinPoinst;
    private double ReturnPoinst;

    
    
    
    //************************sql 使用
    
    private String webname;

    private int intResult;
    private double doubleResult;

    public BetRecords() {
    }
    

    public Long getMemberID() {
        return MemberID;
    }

    public void setMemberID(Long MemberID) {
        this.MemberID = MemberID;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }

    public Long getGameID() {
        return GameID;
    }

    public void setGameID(Long GameID) {
        this.GameID = GameID;
    }

    public Long getBetLottoID() {
        return BetLottoID;
    }

    public void setBetLottoID(Long BetLottoID) {
        this.BetLottoID = BetLottoID;
    }

    public Long getRoundCode() {
        return RoundCode;
    }

    public void setRoundCode(Long RoundCode) {
        this.RoundCode = RoundCode;
    }

    public String getBuyid() {
        return buyid;
    }

    public void setBuyid(String buyid) {
        this.buyid = buyid;
    }

    public String getPlaykey() {
        return playkey;
    }

    public void setPlaykey(String playkey) {
        this.playkey = playkey;
    }

    public String getBetTime() {
        return BetTime;
    }

    public void setBetTime(String BetTime) {
        this.BetTime = BetTime;
    }

    public String getList_id() {
        return list_id;
    }

    public void setList_id(String list_id) {
        this.list_id = list_id;
    }

    public Long getTuiShuiType() {
        return TuiShuiType;
    }

    public void setTuiShuiType(Long TuiShuiType) {
        this.TuiShuiType = TuiShuiType;
    }

    public String getGameType() {
        return GameType;
    }

    public void setGameType(String GameType) {
        this.GameType = GameType;
    }

    public Double getBetPoinst() {
        return BetPoinst;
    }

    public void setBetPoinst(Double BetPoinst) {
        this.BetPoinst = BetPoinst;
    }

    public Double getCommRate() {
        return CommRate;
    }

    public void setCommRate(Double CommRate) {
        this.CommRate = CommRate;
    }

    public String getMoneyMode() {
        return MoneyMode;
    }

    public void setMoneyMode(String MoneyMode) {
        this.MoneyMode = MoneyMode;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public String getBetContent() {
        return BetContent;
    }

    public void setBetContent(String BetContent) {
        this.BetContent = BetContent;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public Long getBetLogID() {
        return BetLogID;
    }

    public void setBetLogID(Long BetLogID) {
        this.BetLogID = BetLogID;
    }

    public int getCancellotto() {
        return cancellotto;
    }

    public void setCancellotto(int cancellotto) {
        this.cancellotto = cancellotto;
    }

    public double getWinPoinst() {
        return WinPoinst;
    }

    public void setWinPoinst(double WinPoinst) {
        this.WinPoinst = WinPoinst;
    }

    public double getReturnPoinst() {
        return ReturnPoinst;
    }

    public void setReturnPoinst(double ReturnPoinst) {
        this.ReturnPoinst = ReturnPoinst;
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname;
    }

    public int getIntResult() {
        return intResult;
    }

    public void setIntResult(int intResult) {
        this.intResult = intResult;
    }

    public double getDoubleResult() {
        return doubleResult;
    }

    public void setDoubleResult(double doubleResult) {
        this.doubleResult = doubleResult;
    }

    
}
