/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.task;

import com.alibaba.fastjson.JSON;
import com.ct855.dao.TeamStatsDao;
import com.ct855.entity.TeamBean;
import com.ct855.entity.TeamStatsBean;
import com.ct855.util.HttpsClientUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author USER
 */
@Component
public class TeamStatsTask {
    @Autowired
    private TeamStatsDao teamStatsdao;
//    @Scheduled(cron = "0/1 * * * * ? ")
    public void Sych() {
        try {
            String result = HttpsClientUtil.getUrl("https://api.fantasydata.net/nba/v2/JSON/TeamSeasonStats/2016");
            List<TeamStatsBean> list = JSON.parseArray(result, TeamStatsBean.class);
            System.out.println("--------------------定时任务"+list.size());
            for (TeamStatsBean bean : list) {
                System.out.println("--------------------aaaa:"+bean.getTeamID());
                if(teamStatsdao.getById((long)bean.getTeamID())==null){
                    teamStatsdao.add(bean);
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
