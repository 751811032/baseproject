package com.ct855.entity;

import java.util.Date;
import java.util.Map;

/**
 *
 * 前台会员实体类
 */
public class Member implements java.io.Serializable {

    /*
    Account	從入口接收到的使用者名稱
Passeord	從入口接收到的使用者密碼
接收	
MEMBERID	使用者ID
ACCOUNT	使用者帳號
POINTS	使用者帳戶餘額
NICKNAME	使用者暱稱
LOTTERYRATE	//銷售返點(時時彩-不定位返水)
LOCATELOTTERYRATE	//銷售返點(時時彩-定位返水)
SHIYIXUANWUFANSHUI	//銷售返點(11選5)
KUAILE8FANSHUI	//銷售返點(快樂8)
FUCAIFANSHUI	//銷售返點(3D/P5P3)

     */
    private String password;
    private Long memberid;
    private String account;
    private Double points;
    private String nickname;
    private Double lotteryrate;
    private Double locatelotteryrate;
    private Double shiyixuanwufanshui;
    private Double kuaile8fanshui;
    private Double fucaifanshui;
    private String webname;

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname;
    }
    
    
    public Member() {
    }

    public Member(String password, Long memberid, String account, Double points, String nickname, Double lotteryrate, Double locatelotteryrate, Double shiyixuanwufanshui, Double kuaile8fanshui, Double fucaifanshui) {
        this.password = password;
        this.memberid = memberid;
        this.account = account;
        this.points = points;
        this.nickname = nickname;
        this.lotteryrate = lotteryrate;
        this.locatelotteryrate = locatelotteryrate;
        this.shiyixuanwufanshui = shiyixuanwufanshui;
        this.kuaile8fanshui = kuaile8fanshui;
        this.fucaifanshui = fucaifanshui;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Double getLotteryrate() {
        return lotteryrate;
    }

    public void setLotteryrate(Double lotteryrate) {
        this.lotteryrate = lotteryrate;
    }

    public Double getLocatelotteryrate() {
        return locatelotteryrate;
    }

    public void setLocatelotteryrate(Double locatelotteryrate) {
        this.locatelotteryrate = locatelotteryrate;
    }

    public Double getShiyixuanwufanshui() {
        return shiyixuanwufanshui;
    }

    public void setShiyixuanwufanshui(Double shiyixuanwufanshui) {
        this.shiyixuanwufanshui = shiyixuanwufanshui;
    }

    public Double getKuaile8fanshui() {
        return kuaile8fanshui;
    }

    public void setKuaile8fanshui(Double kuaile8fanshui) {
        this.kuaile8fanshui = kuaile8fanshui;
    }

    public Double getFucaifanshui() {
        return fucaifanshui;
    }

    public void setFucaifanshui(Double fucaifanshui) {
        this.fucaifanshui = fucaifanshui;
    }

}
