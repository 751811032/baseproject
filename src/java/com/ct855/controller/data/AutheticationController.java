/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.controller.data;

import com.ct855.entity.Member;
import com.ct855.service.MemberService;
import com.ct855.util.Common;
import com.ct855.util.MD5Util;
import com.ct855.util.Md5Tool;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping("/authetication/")
public class AutheticationController {

    Map<String, String> vmembermap = new ConcurrentHashMap<String, String>();

    @Autowired
    private MemberService service;

    /*
    下一级网站验证登录获取登录url 所有的失sql都是没有经过编译的，因此字符在这里没有加上引号 那么在代码中间要强制加上引号
     */
    @RequestMapping("validate")
    @ResponseBody
    public String validate(Model model, Member member, HttpServletResponse response) {//传入参数 /authetication/validate.html?webname=webname&account='charles'&password='11111' 根据webname决定查询那个表 账号和密码需要加上单引号
        response.setContentType("application/xml");
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("<Info>");
        member.setAccount("'"+ member.getAccount() + "'");
        member.setPassword("'" + member.getPassword() + "'");//凡是字符都需加引号

        Member a = service.getByAccount(member);//用户存在就验证 不存在就创建
        if (a == null) {
            Member b = new Member(member.getPassword() , null,  member.getAccount() ,0.0,  member.getAccount(),0.0,0.0,0.0,0.0, 0.0);//创建的时候设置反水
           b.setWebname(member.getWebname());
           service.add(b);
        }
        Member amember = service.verifyMember(member);
        if (amember == null) {//用户不存在
            sb.append("<wl_login_url value=\"http://6788.250438.com:8088/?mod=game\"/>");
            sb.append("<errorcode value=1/>");
            sb.append("<errormsg value=\"failure\"/>");
            sb.append("</Info>");
            return sb.toString();
        }
        String account = member.getAccount();
        String tag = System.currentTimeMillis() + "";
        String inpass = MD5Util.GetMD5Code(member.getPassword() + tag);
        String inacct = account.substring(1, account.length() - 1) + "@" + member.getWebname();//每一个网站来的账号 加上
        vmembermap.put(inacct, inpass);//验证通过 存放进map account@webname
        sb.append("<wl_login_url value=" + "\"http://6788.250438.com:8088/?mod=login&uid=" + inacct + "&pass=" + inpass + "\"/>");
        sb.append("<errorcode value=0/>");
        sb.append("<errormsg value=\"success\"/>");
        sb.append("</Info>");
        System.out.println(sb.toString());

        return sb.toString();
    }

    /*
纬来服务器请求接口 进行验证
     */
    @RequestMapping("MemberLogin")//纬来服务器请求接口 进行验证
    @ResponseBody
    public String MemberLogin(Model model, String Account, String Passeord, HttpServletResponse response) {//account@webname
        response.setContentType("application/xml");

        StringBuilder sb = new StringBuilder();
        String passwordmd5 = vmembermap.get(Account);

        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("<Info>");

        if (Common.isEmpty(Passeord) || Common.isEmpty(Account) || passwordmd5 == null) {
            sb.append("<ERRORCODE VALUE=1 />");
            sb.append("<ERRORMSG VALUE=\"parameters null or repeat request\" />");
            sb.append("</Info>");
            System.out.println(sb.toString());

            return sb.toString();
        }
        passwordmd5 = passwordmd5.trim();
        String[] arr = Account.split("@");//确保账号不能有@ 如果有，那也是最后一个@分割
        String iAccount = arr[0];
        String webname = arr[arr.length-1];
        Member tmp = new Member();
        tmp.setWebname(webname);
        tmp.setAccount("'" + iAccount + "'");
        Member member = service.getByAccount(tmp);//获取用户

        if (!passwordmd5.equals(Passeord) || member == null || arr.length != 2) {//验证无法通过
            sb.append("<ERRORCODE VALUE=2 />");
            sb.append("<ERRORMSG VALUE=\"verfiy failure\" />");
            sb.append("</Info>");
            System.out.println(sb.toString());

            return sb.toString();

        }
        sb.append("<MEMBERID VALUE=" + member.getMemberid() + " />");
        sb.append("<ACCOUNT  VALUE =" + member.getAccount() + " />");
        sb.append("<POINTS VALUE =" + member.getPoints() + " />");
        sb.append("<NICKNAME VALUE =" + member.getNickname() + " />");
        sb.append("<LOCATELOTTERYRATE  VALUE =" + member.getLocatelotteryrate() + " />");
        sb.append("<SHIYIXUANWUFANSHUI VALUE =" + member.getShiyixuanwufanshui() + " />");
        sb.append("<LOTTERYRATE VALUE =" + member.getLotteryrate() + " />");
        sb.append("<KUAILE8FANSHUI VALUE =" + member.getKuaile8fanshui() + " />");
        sb.append("<FUCAIFANSHUI VALUE =" + member.getFucaifanshui() + " />");
        sb.append("<ERRORCODE VALUE=0 />");
        sb.append("<ERRORMSG VALUE=\"verfiy success\" />");
        sb.append("</Info>");
        System.out.println(sb.toString());
        vmembermap.remove(Account);//从队列中取出
        return sb.toString();

    }

}
