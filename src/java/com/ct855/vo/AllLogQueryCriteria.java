package com.ct855.vo;

import java.util.List;

/**
 * 此类用作存款记录查询时从页面收集查询信息的值对象（即不参与serialize)
 */
public class AllLogQueryCriteria {

    // 搜索的主类型
    private List type;
    // 单一会员用户名
    private String userName;
    // 搜索的开始时间（timeType指定其搜索类型）
    private String startTime;
    // 搜索的结束时间（timeType指定其搜索类型）
    private String endTime;
    // 刷新频率（0表示不刷新）
    private int refreshRate;
    private String orderId;
    private int flag = 0;
    private String typeStr;//用户输入类型

    public AllLogQueryCriteria() {

    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public static String validateString(String inputString) {
        return (inputString == null ? "" : inputString.trim());
    }

    public List getType() {
        return type;
    }

    public void setType(List type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = validateString(userName);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = validateString(orderId);;
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

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

}
