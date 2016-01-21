package com.ct855.dao;

import com.ct855.base.BaseDao;
import com.ct855.entity.GameBean;
import com.ct855.entity.PlayerBean;
import java.util.List;

/**
 * 会员Dao
 */
public interface PlayerDao extends BaseDao<PlayerBean> {
    public int add(PlayerBean playerBean);
    public List<PlayerBean> getAllPlayer();
    public List<PlayerBean> getPlayerByTeamId(Long id);
    public List<PlayerBean> getPlayerByTeam(String team);
}
