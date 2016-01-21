package com.ct855.dao;

import com.ct855.base.BaseDao;
import com.ct855.entity.PlayerStatsBean;
import java.util.List;

/**
 * 会员Dao
 */
public interface PlayerStatsDao extends BaseDao<PlayerStatsBean> {
    public int add(PlayerStatsBean playerStatsBean);
    public PlayerStatsBean getById(Long id);
    public List<PlayerStatsBean> getAllPlayerStats();
    public List<PlayerStatsBean> getByPointOrder();
    public List<PlayerStatsBean> getByReboundsOrder();
}
