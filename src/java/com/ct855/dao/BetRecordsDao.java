/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.dao;

import com.ct855.base.BaseDao;
import com.ct855.entity.BetRecords;

/**
 *
 * @author USER
 */
public interface BetRecordsDao extends BaseDao<BetRecords> {
    
    public BetRecords getByBetlottoId(BetRecords betRecords);

    public int cancelOrder(BetRecords betRecords);

    public int winOrder(BetRecords betRecords);

    public int returnPoint(BetRecords betRecords);
}
