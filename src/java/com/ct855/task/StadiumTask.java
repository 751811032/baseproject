/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.task;

import com.alibaba.fastjson.JSON;
import com.ct855.dao.StadiumDao;
import com.ct855.entity.StadiumBean;
import com.ct855.util.HttpsClientUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Rain
 */
@Component
public class StadiumTask {
    @Autowired
    private StadiumDao stadiumDao;
//    @Scheduled(cron = "0/1 * * * * ? ")
    public void Sych() {
        try {
            String result = HttpsClientUtil.getUrl("https://api.fantasydata.net/nba/v2/JSON/Stadiums");
            System.out.println(result);
            List<StadiumBean> stadiumList = JSON.parseArray(result, StadiumBean.class);
            for (StadiumBean bean : stadiumList) {
                if(stadiumDao.getById(bean.getStadiumID())==null){
                    stadiumDao.add(bean);
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            String result = HttpsClientUtil.getUrl("https://api.fantasydata.net/nba/v2/JSON/Stadiums");
            List<StadiumBean> list = JSON.parseArray(result, StadiumBean.class);
            System.out.println(list.size());
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
