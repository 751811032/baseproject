package com.ct855.dao;

import com.ct855.base.BaseDao;
import com.ct855.entity.TeamBean;
import com.ct855.entity.TeamStatsBean;
import java.util.List;

/**
 * 会员Dao
 */
public interface TeamStatsDao extends BaseDao<TeamStatsBean> {
    public int add(TeamStatsBean teamStatsBean);
    public List<TeamStatsBean> getAllTeamStats();
    public TeamStatsBean getById(Long id);
    public List<TeamStatsBean> getEastTeamStats();
    public List<TeamStatsBean> getWestTeamStats();
}
