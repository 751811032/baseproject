package com.ct855.dao.impl;

import com.ct855.base.impl.BaseDaoImpl;
import com.ct855.dao.StandingDao;
import com.ct855.dao.TeamDao;
import com.ct855.entity.StandingBean;
import com.ct855.entity.TeamBean;
import com.ct855.util.PageView;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * @author Rain
 */
@Repository("standingDao")
public class StandingDaoImpl extends BaseDaoImpl<StandingBean> implements StandingDao {

    @Override
    public List<StandingBean> getAllStanding() {
        return getSqlSession().selectList(this.getClassName() + ".getAllStanding");
    }

    @Override
    public StandingBean getByTeamId(Long id) {
        return getSqlSession().selectOne(this.getClassName() + ".getById", id);
    }

    @Override
    public List<StandingBean> getEastStanding() {
        return getSqlSession().selectList(this.getClassName() + ".getEastStanding");
    }

    @Override
    public List<StandingBean> getWestStanding() {
        return getSqlSession().selectList(this.getClassName() + ".getWestStanding");
    }

}
