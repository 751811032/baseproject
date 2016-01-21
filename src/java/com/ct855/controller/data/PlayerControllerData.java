/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.controller.data;
import com.ct855.dao.PlayerDao;
import com.ct855.entity.PlayerBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author USER
 */
@Controller
@RequestMapping("/nba/v2/JSON/")
public class PlayerControllerData {
    @Autowired
    private PlayerDao playerdao;
    @RequestMapping("playerbyid")
    @ResponseBody
    
    public PlayerBean getPlayerById() {
        PlayerBean bean = playerdao.getById((long)20000438);
        return bean;
    }
    
    @RequestMapping("playerbyteamid")
    @ResponseBody

    public List<PlayerBean> getGPlayerByTeamId() {
        List<PlayerBean> list = playerdao.getPlayerByTeamId((long)1);
        return list;
    }
    @RequestMapping("players")
    @ResponseBody

    public List<PlayerBean> getPlayer() {
        List<PlayerBean> player = playerdao.getAllPlayer();
        return player;
    }
    
    @RequestMapping("playerbyteam")
    @ResponseBody
     public List<PlayerBean> getAllPlayrer() {
        List<PlayerBean> list = playerdao.getPlayerByTeam("LAC");
        return list;
    }
}
