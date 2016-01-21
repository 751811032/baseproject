package com.ct855.dao.impl;

import com.ct855.base.impl.BaseDaoImpl;
import com.ct855.dao.PlayerDao;
import com.ct855.entity.PlayerBean;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rain
 */
@Repository("playerDao")
public class PlayerDaoImpl extends BaseDaoImpl<PlayerBean> implements PlayerDao {

    @Override
    public List<PlayerBean> getAllPlayer() {
        return getSqlSession().selectList(this.getClassName() + ".getAllPlayer");
    }

    @Override
    public List<PlayerBean> getPlayerByTeamId(Long id) {
        return getSqlSession().selectList(this.getClassName() + ".getPlayerByTeamId",id);
    }

    @Override
    public List<PlayerBean> getPlayerByTeam(String team) {
        return getSqlSession().selectList(this.getClassName() + ".getPlayerByTeam",team);
    }
}
