/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.controller.data;

import com.ct855.dao.PlayerStatsDao;
import com.ct855.entity.PlayerStatsBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping("/nba/v2/JSON/")
public class PlayerStatsControllerData {

    @Autowired
    private PlayerStatsDao playerStatsDao;

    @RequestMapping("playerStats")
    @ResponseBody
    public List<PlayerStatsBean> getPointOrder() {
        List<PlayerStatsBean> list = playerStatsDao.getByPointOrder();
        return list;
    }
    
    
}
