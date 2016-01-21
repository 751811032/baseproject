/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.controller.data;

import com.ct855.dao.GameDao;
import com.ct855.dao.StandingDao;
import com.ct855.entity.GameBean;
import com.ct855.entity.StandingBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author USER
 */
@Controller
@RequestMapping("/nba/v2/JSON/standing")
public class StandingControllerData {
    @Autowired
    private StandingDao standingdao;

    @RequestMapping("")
    @ResponseBody

    public List<StandingBean> getStanding() {
        List<StandingBean> list = standingdao.getAllStanding();
        return list;
    }
    
    @RequestMapping("byteamid")
    @ResponseBody

    public StandingBean getStandingByTeamId() {
        StandingBean list = standingdao.getByTeamId((long)1);
        return list;
    }
    
    @RequestMapping("East")
    @ResponseBody
    public List<StandingBean> getEastStanding() {
        List<StandingBean> list = standingdao.getEastStanding();
        return list;
    }
    
    @RequestMapping("West")
    @ResponseBody
    public List<StandingBean> getWestStanding() {
        List<StandingBean> list = standingdao.getWestStanding();
        return list;
    }
}
