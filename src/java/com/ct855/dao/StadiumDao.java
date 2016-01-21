package com.ct855.dao;

import com.ct855.base.BaseDao;
import com.ct855.entity.StadiumBean;
import java.util.List;

/**
 * 会员Dao
 */
public interface StadiumDao extends BaseDao<StadiumBean> {
    public int add(StadiumBean stadiumBean);
    public List<StadiumBean> getAllStadium();
    public StadiumBean getById(Long id);
}

