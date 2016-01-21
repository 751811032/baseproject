package com.ct855.vo;

/**
 * 此类用作存款记录查询时从页面收集查询信息的值对象（即不参与serialize)
 */
public class DepositLogQueryCriteria {

    // 搜索的主类型
    private int type;
    // 搜索的主类型对应的输入值
    private String typeStr;
    // 当前状态
    private int status;
    // 存款区间的最小值
    private String depositMinAmount;
    // 存款区间的最大值
    private String depositMaxAmount;
    // 搜索的时间类型
    private int timeType;
    // 搜索的开始时间（timeType指定其搜索类型）
    private String startTime;
    // 搜索的结束时间（timeType指定其搜索类型）
    private String endTime;
    // 刷新频率（0表示不刷新）
    private int refreshRate;

    public DepositLogQueryCriteria() {

    }

    public static String validateString(String inputString) {
        return (inputString == null ? "" : inputString.trim());
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = validateString(typeStr);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDepositMinAmount() {
        return depositMinAmount;
    }

    public void setDepositMinAmount(String depositMinAmount) {
        this.depositMinAmount = validateString(depositMinAmount);
    }

    public String getDepositMaxAmount() {
        return depositMaxAmount;
    }

    public void setDepositMaxAmount(String depositMaxAmount) {
        this.depositMaxAmount = validateString(depositMaxAmount);
    }

    public int getTimeType() {
        return timeType;
    }

    public void setTimeType(int timeType) {
        this.timeType = timeType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = validateString(startTime);
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = validateString(endTime);
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }
}
