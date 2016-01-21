package com.ct855.dao;

import com.ct855.base.BaseDao;
import com.ct855.entity.GameBean;
import java.util.List;

/**
 * 会员Dao
 */
public interface GameDao extends BaseDao<GameBean> {
    public int add(GameBean teambean);
    public List<GameBean> getGameByTeam(int id);
    public List<GameBean> getGameByDate(String day);
    public GameBean getById(Long id);
    public List<GameBean> getAllGame();
}
