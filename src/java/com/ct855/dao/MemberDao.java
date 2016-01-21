package com.ct855.dao;

import com.ct855.base.BaseDao;
import com.ct855.entity.Member;
import java.util.List;
import java.util.Map;

/**
 *
 * 会员Dao
 */
public interface MemberDao extends BaseDao<Member> {

    public int updateBalance(Member member);

    public Member getByUserName(Member member);

    public int isSameUsername(String username);

    public int isSameEmail(String email);

    public Member verifyMember(Member member);

    public int updatePwd(Member member);

    public Member findEmail(String email);

    public Double getBalance(Long id);

    public void findCheckCode(Map<String, Long> map);
    

    /**
     * 修改提款密码
     *
     * @param member
     * @return
     */
    public int updateQKPwd(Member member);

    /**
     * 修改状态
     *
     * @param member
     * @return
     */
    public int updateEnable(Member member);

    /**
     * 修改会员流水号
     *
     * @param bank
     * @return
     */
    public int updateCheckCode(Member member);



    public int getMemberCount(Map<String, Object> map);

    public Long getParentById(long memberId);
    //删除会员卡关联
    public int deleteBankByMemberId(Long memberId);
    
    public List<Member> findDepositNum(Integer num);
    
}
