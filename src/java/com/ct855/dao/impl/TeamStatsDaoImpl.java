package com.ct855.dao.impl;

import com.ct855.base.impl.BaseDaoImpl;
import com.ct855.dao.TeamDao;
import com.ct855.dao.TeamStatsDao;
import com.ct855.entity.TeamBean;
import com.ct855.entity.TeamStatsBean;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rain
 */
@Repository("teamStatsDao")
public class TeamStatsDaoImpl extends BaseDaoImpl<TeamStatsBean> implements TeamStatsDao {

    @Override
    public List<TeamStatsBean> getAllTeamStats() {
        return getSqlSession().selectList(this.getClassName() + ".getAllTeamStats");
    }

    @Override
    public List<TeamStatsBean> getEastTeamStats() {
        return getSqlSession().selectList(this.getClassName() + ".getEastTeamStats");
    }

    @Override
    public List<TeamStatsBean> getWestTeamStats() {
        return getSqlSession().selectList(this.getClassName() + ".getWestTeamStats");
    }
}
