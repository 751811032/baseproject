/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.controller.data;

import com.ct855.entity.BetRecords;
import com.ct855.service.BetRecordsService;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping("/bet/")
public class BetBizController {

    @Autowired
    private BetRecordsService betservice;

    @RequestMapping("LottoBet")
    @ResponseBody
    public String lottoBet(Model model, BetRecords betRecords, HttpServletResponse response) {//传入参数 
        /*
        根据memberid找用户  要在账号后面加后缀进行区分 只有memberid会很不方便，要多增加一张表 维护memberid与分组的关系，如果可以直接返回账号就很方便了 与纬来交涉 等待回复 
         */
        String[] arr = betRecords.getAccount().split("@");
        betRecords.setAccount(arr[0]);
        betRecords.setWebname(arr[1]);//设置网站名称
        response.setContentType("application/xml");
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("<Info>");
        try {
            int a = betservice.add(betRecords);//如果传入的参数不对 抛出错误 
            /*
            然后操作用户的余额----
            */
        } catch (Exception e) {
            e.printStackTrace();
            sb.append("<ErrorCode Value=\"1\"/>");
            sb.append("<ErrorMsg Value=\"parameters error\"/>");
            return sb.toString();
        }
        sb.append("<BetLogID Value=\"" + betRecords.getBetLogID() + "\"/>");
        sb.append("<ErrorCode Value=\"1\"/>");
        sb.append("<ErrorMsg Value=\"parameters error\"/>");
        sb.append("</Info>");
        return sb.toString();
    }

    @RequestMapping("CancelLotto")
    @ResponseBody
    public String cancelLotto(Model model, BetRecords betRecords, HttpServletResponse response) {//传入参数 

        String[] arr = betRecords.getAccount().split("@");
        betRecords.setAccount(arr[0]);
        betRecords.setWebname(arr[1]);//设置网站名称
        response.setContentType("application/xml");
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("<Info>");

        try {
            int a = betservice.cancelOrder(betRecords);//如果传入的参数不对
        } catch (Exception e) {
            e.printStackTrace();
            sb.append("<ErrorCode Value=\"1\"/>");
            sb.append("<ErrorMsg Value=\"parameters error\"/>");
            return sb.toString();
        }
        sb.append("<BetLogID Value=\"" + betRecords.getBetLogID() + "\"/>");
        sb.append("<ErrorCode Value=\"1\"/>");
        sb.append("<ErrorMsg Value=\"parameters error\"/>");
        sb.append("</Info>");
        return sb.toString();

    }

    @RequestMapping("LottoWin")
    @ResponseBody
    public String lottoWin(Model model, BetRecords betRecords, HttpServletResponse response) {//传入参数 

        String[] arr = betRecords.getAccount().split("@");
        betRecords.setAccount(arr[0]);
        betRecords.setWebname(arr[1]);//设置网站名称
        response.setContentType("application/xml");
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("<Info>");

        try {
            int a = betservice.winOrder(betRecords);//如果传入的参数不对
        } catch (Exception e) {
            e.printStackTrace();
            sb.append("<ErrorCode Value=\"1\"/>");
            sb.append("<ErrorMsg Value=\"parameters error\"/>");
            return sb.toString();
        }
        sb.append("<BetLogID Value=\"" + betRecords.getBetLogID() + "\"/>");
        sb.append("<ErrorCode Value=\"1\"/>");
        sb.append("<ErrorMsg Value=\"parameters error\"/>");
        sb.append("</Info>");
        return sb.toString();

    }

    @RequestMapping("LottoReturnPoinst")
    @ResponseBody
    public String lottoReturnPoinst(Model model, BetRecords betRecords, HttpServletResponse response) {//传入参数 

        String[] arr = betRecords.getAccount().split("@");
        betRecords.setAccount(arr[0]);
        betRecords.setWebname(arr[1]);//设置网站名称
        response.setContentType("application/xml");
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("<Info>");

        try {
            int a = betservice.returnPoints(betRecords);//如果传入的参数不对
        } catch (Exception e) {
            e.printStackTrace();
            sb.append("<ErrorCode Value=\"1\"/>");
            sb.append("<ErrorMsg Value=\"parameters error\"/>");
            return sb.toString();
        }
        sb.append("<BetLogID Value=\"" + betRecords.getBetLogID() + "\"/>");
        sb.append("<ErrorCode Value=\"1\"/>");
        sb.append("<ErrorMsg Value=\"parameters error\"/>");
        sb.append("</Info>");
        return sb.toString();

    }

    @RequestMapping("betDetail")
    @ResponseBody
    public String betDetail(Model model, BetRecords betRecords, HttpServletResponse response) {//传入参数 
        String[] arr = betRecords.getAccount().split("@");
        betRecords.setAccount(arr[0]);
        betRecords.setWebname(arr[1]);//设置网站名称
        return "http://6788.250438.com:8088/do.php?mod=read&lobby&code=game&list=info&flag=yes&uid=" + betRecords.getBuyid();
    }
}
