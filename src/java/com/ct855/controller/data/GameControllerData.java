/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.controller.data;

import com.ct855.dao.GameDao;
import com.ct855.entity.GameBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author USER
 */
@Controller
@RequestMapping("/nba/v2/JSON/")
public class GameControllerData {
    @Autowired
    private GameDao gamedao;

    @RequestMapping("gamebyteam")
    @ResponseBody

    public List<GameBean> getGameByTeam() {
        List<GameBean> list = gamedao.getGameByTeam(1);
        return list;
    }
    @RequestMapping("gamebydate/{date}")
    @ResponseBody
    public List<GameBean> getGameByDate(Model model,@PathVariable String date) {
     //   List<GameBean> list = gamedao.getGameByDate("2015-12-15T00:00:00");
        List<GameBean> list = gamedao.getGameByDate(date+"T00:00:00");
        return list;
    }
    @RequestMapping("gamebyid")
    @ResponseBody

    public GameBean getGameById() {
        long a = 7788;
        GameBean game = gamedao.getById(a);
        return game;
    }
    
    @RequestMapping("gameall")
    @ResponseBody
     public List<GameBean> getAllGame() {
         System.out.print("aaaaaaaaaaa");
        List<GameBean> list = gamedao.getAllGame();
        return list;
    }
}