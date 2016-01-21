package com.ct855.dao;

import com.ct855.base.BaseDao;
import com.ct855.entity.TeamBean;
import java.util.List;

/**
 * 会员Dao
 */
public interface TeamDao extends BaseDao<TeamBean> {
    public int add(TeamBean teambean);
    public List<TeamBean> getAllTeam();
    public TeamBean getById(Long id);
    public List<TeamBean> getEastTeam();
    public List<TeamBean> getWestTeam();
}
