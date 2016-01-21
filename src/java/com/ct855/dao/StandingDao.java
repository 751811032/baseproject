package com.ct855.dao;

import com.ct855.base.BaseDao;
import com.ct855.entity.StandingBean;
import java.util.List;

/**
 * 会员Dao
 */
public interface StandingDao extends BaseDao<StandingBean> {
    public List<StandingBean> getAllStanding();
    public StandingBean getByTeamId(Long id);
    public List<StandingBean> getEastStanding();
    public List<StandingBean> getWestStanding();
}
