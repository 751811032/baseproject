package com.ct855.dao.impl;

import com.ct855.base.impl.BaseDaoImpl;
import com.ct855.dao.GameDao;
import com.ct855.entity.GameBean;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rain
 */
@Repository("gameDao")
public class GameDaoImpl extends BaseDaoImpl<GameBean> implements GameDao {

    @Override
    public List<GameBean> getGameByTeam(int id) {
        return getSqlSession().selectList(this.getClassName() + ".getGameByTeam",id);
    }

    @Override
    public List<GameBean> getGameByDate(String day) {
        return getSqlSession().selectList(this.getClassName() + ".getGameByDate",day);
    }

    @Override
    public GameBean getById(Long id) {
       return getSqlSession().selectOne(this.getClassName() + ".getById", id);
    }

    @Override
    public List<GameBean> getAllGame() {
        return getSqlSession().selectList(this.getClassName() + ".getAllGame");
    }
}
