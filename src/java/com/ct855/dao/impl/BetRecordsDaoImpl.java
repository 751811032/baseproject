/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.dao.impl;

import com.ct855.base.impl.BaseDaoImpl;
import com.ct855.dao.BetRecordsDao;
import com.ct855.entity.BetRecords;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository("betRecordsDao")
public class BetRecordsDaoImpl extends BaseDaoImpl<BetRecords> implements BetRecordsDao {

    @Override
    public BetRecords getByBetlottoId(BetRecords betRecords) {
        return getSqlSession().selectOne(this.getClassName() + ".getByBetlottoId", betRecords);
    }

    @Override
    public int cancelOrder(BetRecords betRecords) {
        return getSqlSession().update(this.getClassName() + ".cancelOrder", betRecords);
    }

    @Override
    public int winOrder(BetRecords betRecords) {
        return getSqlSession().update(this.getClassName() + ".winOrder", betRecords);
    }

    @Override
    public int returnPoint(BetRecords betRecords) {
        return getSqlSession().update(this.getClassName() + ".returnPoint", betRecords);
    }

}
