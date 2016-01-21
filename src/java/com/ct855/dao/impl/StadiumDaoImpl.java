package com.ct855.dao.impl;

import com.ct855.base.impl.BaseDaoImpl;
import com.ct855.dao.StadiumDao;
import com.ct855.dao.TeamDao;
import com.ct855.entity.StadiumBean;
import com.ct855.entity.TeamBean;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * @author rain
 */
@Repository("stadiumDao")
public class StadiumDaoImpl extends BaseDaoImpl<StadiumBean> implements StadiumDao {
//    @Override
//    public int add(TeamBean teambean) {
//        return getSqlSession().insert(this.getClassName() + ".add",teambean);
//    }
 
    @Override
    public StadiumBean getById(Long id) {
        return getSqlSession().selectOne(this.getClassName() + ".getById", id);
    }

    @Override
    public List<StadiumBean> getAllStadium() {
        return getSqlSession().selectList(this.getClassName() + ".getById");
    }

}
