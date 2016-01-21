package com.ct855.dao.impl;

import com.ct855.base.impl.BaseDaoImpl;
import com.ct855.dao.PlayerStatsDao;
import com.ct855.entity.PlayerStatsBean;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rain
 */
@Repository("playerStatsDao")
public class PlayerStatsDaoImpl extends BaseDaoImpl<PlayerStatsBean> implements PlayerStatsDao {

//
//    @Override
//    public int add(TeamBean teambean) {
//        return getSqlSession().insert(this.getClassName() + ".add",teambean);
//    } 
    @Override
    public PlayerStatsBean getById(Long id){
        return getSqlSession().selectOne(this.getClassName() + ".getById",id);
    }
   
    @Override
    public List<PlayerStatsBean> getAllPlayerStats() {
        return getSqlSession().selectList(this.getClassName() + ".getAllPlayerStats");
    }

    @Override
    public List<PlayerStatsBean> getByPointOrder() {
        return getSqlSession().selectList(this.getClassName() + ".getPointOrder");
    }

    @Override
    public List<PlayerStatsBean> getByReboundsOrder() {
        return getSqlSession().selectList(this.getClassName() + ".getReboundsOrder");
    }

}
