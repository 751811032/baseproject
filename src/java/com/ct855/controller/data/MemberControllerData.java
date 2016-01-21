package com.ct855.controller.data;

import com.crown.util.MD5;

import com.ct855.entity.Member;

import com.ct855.service.MemberService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 会员管理控制
 */
@Controller
@RequestMapping("/member/")
public class MemberControllerData {

    @Autowired
    private MemberService service;
    
  

    private DateFormat format = new SimpleDateFormat("yyyy-MM-dd");


    @RequestMapping(value = "add")
    public String add(Model model, Member member, String birthDay) {
        if (member.getPassword() != null && member.getPassword().length() > 5) {
            member.setPassword(MD5.encode(member.getPassword()));
        }

        try {
            service.add(member);
        } catch (Exception ex) {
            Logger.getLogger(MemberControllerData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:query.html";
    }
 
   
  



}
