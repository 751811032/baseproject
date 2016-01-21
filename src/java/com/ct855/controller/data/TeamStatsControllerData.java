/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.controller.data;
import com.ct855.dao.TeamStatsDao;
import com.ct855.entity.TeamStatsBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author USER
 */
@Controller
@RequestMapping("/nba/v2/JSON/teamstats")
public class TeamStatsControllerData {
    @Autowired
    private TeamStatsDao teamStatsDao;
    @RequestMapping("")
    @ResponseBody

    public List<TeamStatsBean> getTeamStatsByTeam() {
        List<TeamStatsBean> list = teamStatsDao.getAllTeamStats();
        return list;
    }
    
    @RequestMapping("byid")
    @ResponseBody

    public TeamStatsBean getTeamStatsById() {
        TeamStatsBean list = teamStatsDao.getById((long)1);
        return list;
    }
}
