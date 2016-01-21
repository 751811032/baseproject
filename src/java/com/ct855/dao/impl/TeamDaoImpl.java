package com.ct855.dao.impl;

import com.ct855.base.impl.BaseDaoImpl;
import com.ct855.dao.TeamDao;
import com.ct855.entity.TeamBean;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rain
 */
@Repository("teamDao")
public class TeamDaoImpl extends BaseDaoImpl<TeamBean> implements TeamDao {

//
//    @Override
//    public int add(TeamBean teambean) {
//        return getSqlSession().insert(this.getClassName() + ".add",teambean);
//    }

    @Override
    public List<TeamBean> getAllTeam() {
       return getSqlSession().selectList(this.getClassName() + ".getAllTeam");
    }

    @Override
    public TeamBean getById(Long id) {
        return getSqlSession().selectOne(this.getClassName() + ".getById", id);
    }

    @Override
    public List<TeamBean> getEastTeam() {
        return getSqlSession().selectList(this.getClassName() + ".getEastTeam");
    }

    @Override
    public List<TeamBean> getWestTeam() {
        return getSqlSession().selectList(this.getClassName() + ".getWestTeam");
    }
}
