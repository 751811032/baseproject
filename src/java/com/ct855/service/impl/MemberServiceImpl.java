package com.ct855.service.impl;

import com.crown.util.MD5;
import com.ct855.dao.MemberDao;

import com.ct855.entity.Member;

import com.ct855.service.MemberService;
import com.ct855.util.PageView;
import com.ct855.util.PropertiesUtils;
import com.ct855.util.HttpClientUtils;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author RSN GROUP
 */
@Transactional(rollbackFor = RuntimeException.class)
@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao dao;

    private static final Logger LOG = Logger.getLogger(MemberServiceImpl.class.getName());

    @Override
    public int add(Member member) throws RuntimeException {

        int num = dao.add(member);

        return num;
    }

    @Override
    public void updateBalance(Member member) {
        dao.updateBalance(member);
    }

    @Override
    public Boolean isSameUsername(String username) {
        return dao.isSameUsername(username) > 0 ? true : false;
    }

    @Override
    public Member verifyMember(Member member) {
        return dao.verifyMember(member);
    }

    @Override
    public Double getBalance(Long id) {
        return dao.getBalance(id);
    }

    @Override
    public Member getByAccount(Member tmp) {
        return dao.getByUserName(tmp);
    }
 
    
}
