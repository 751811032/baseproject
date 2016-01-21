package com.ct855.dao.impl;

import com.ct855.base.impl.BaseDaoImpl;
import com.ct855.dao.MemberDao;
import com.ct855.entity.Member;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RSN GROUP
 */
@Repository("memberDao")
public class MemberDaoImpl extends BaseDaoImpl<Member> implements MemberDao {

    /**
     * 更新会员余额
     *
     * @param member
     * @return
     */
    @Override

    public int updateBalance(Member member) {
        return (int) getSqlSession().update(this.getClassName() + ".updateBalance", member);
    }

    @Override
    public int isSameUsername(String username) {
        return (int) getSqlSession().selectOne(this.getClassName() + ".checkUsername", username);
    }

    @Override
    public int isSameEmail(String email) {

        return (int) getSqlSession().selectOne(this.getClassName() + ".checkEmail", email);
    }

    @Override
    public Member verifyMember(Member member) {
        return getSqlSession().selectOne(this.getClassName() + ".verifyLogin", member);
    }

    @Override
    public int updatePwd(Member member) {
        return getSqlSession().update(this.getClassName() + ".updatePwd", member);
    }

    @Override
    public Member findEmail(String email) {
        return getSqlSession().selectOne(this.getClassName() + ".findEmail", email);
    }

    @Override
    public Double getBalance(Long id) {
        return getSqlSession().selectOne(this.getClassName() + ".getBalance", id);
    }

    @Override
    public void findCheckCode(Map<String, Long> map) {
        getSqlSession().selectOne(this.getClassName() + ".findCheckCode", map);
    }

    @Override
    public int updateQKPwd(Member member) {
        return getSqlSession().update(this.getClassName() + ".updateQKPwd", member);
    }

    @Override
    public int updateEnable(Member member) {
        return getSqlSession().update(this.getClassName() + ".updateEnable", member);
    }

    @Override
    public int updateCheckCode(Member member) {
        return getSqlSession().update(this.getClassName() + ".updateCheckCode", member);
    }

    @Override
    public int getMemberCount(Map<String, Object> map) {
        return getSqlSession().selectOne(this.getClassName() + ".countMember", map);
    }

    @Override
    public Long getParentById(long memberId) {
        return getSqlSession().selectOne(this.getClassName() + ".getParentById", memberId);
    }

    @Override
    public int deleteBankByMemberId(Long memberId) {
        return getSqlSession().delete(this.getClassName() + ".deleteBankByMemberId", memberId);
    }

    @Override
    public List<Member> findDepositNum(Integer num) {
        return getSqlSession().selectList(this.getClassName() + ".findDepositNum", num);
    }

    @Override
    public Member getByUserName(Member member) {
        return getSqlSession().selectOne(this.getClassName() + ".getByUserName", member);
    }

}
