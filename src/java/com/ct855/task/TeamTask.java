/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.task;

import com.alibaba.fastjson.JSON;
import com.ct855.dao.TeamDao;
import com.ct855.entity.TeamBean;
import com.ct855.util.HttpsClientUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author USER
 */
@Component
public class TeamTask {
    @Autowired
    private TeamDao teamdao;
//    @Scheduled(cron = "0/1 * * * * ? ")
    public void Sych() {

        try {
            String result = HttpsClientUtil.getUrl("https://api.fantasydata.net/nba/v2/JSON/teams");

            List<TeamBean> list = JSON.parseArray(result, TeamBean.class);
            System.out.println("--------------------定时任务"+list.size());
            for (TeamBean bean : list) {
                System.out.println("--------------------aaaa:"+bean.getTeamID());
                if(teamdao.getById(bean.getTeamID())==null){
                    teamdao.add(bean);
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    public static void main(String[] args) {

        try {
            String result = HttpsClientUtil.getUrl("https://api.fantasydata.net/nba/v2/JSON/teams");

            List<TeamBean> list = JSON.parseArray(result, TeamBean.class);
            System.out.println(list.size());
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
