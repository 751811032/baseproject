package com.ct855.service;

import com.ct855.entity.Member;
import com.ct855.util.PageView;
import java.util.List;
import java.util.Map;

/**
 * 会员业务
 *
 * @author RSN GROUP
 */
public interface MemberService {

  

    public int add(Member member) throws RuntimeException;

 
    /**
     * 更新会员余额
     *
     * @param member
     */
    public void updateBalance(Member member);

    /**
     * 用户名是否可用
     *
     * @param username 用户名
     * @return
     */
    public Boolean isSameUsername(String username);
 
    public Member verifyMember(Member member);

    /**
     * 更改密码
     *
     * @param member
     * @return
     */
   
    public Double getBalance(Long id);

 
    public Member getByAccount(Member tmp);
    
    
   

}
