/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.service.impl;

import com.ct855.dao.BetRecordsDao;
import com.ct855.entity.BetRecords;
import com.ct855.service.BetRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USER
 */
@Transactional(rollbackFor = RuntimeException.class)
@Service("BetRecordsService")
public class BetRecordsServiceImpl implements BetRecordsService {

    @Autowired
    private BetRecordsDao dao;

    @Override
    public int add(BetRecords betRecords) {
        return dao.add(betRecords);
    }

    @Override
    public int cancelOrder(BetRecords betRecords) {
        return dao.cancelOrder(betRecords);
    }

    @Override
    public int winOrder(BetRecords betRecords) {
        return dao.winOrder(betRecords);
    }

    @Override
    public int returnPoints(BetRecords betRecords) {
        return dao.returnPoint(betRecords);
    }

    @Override
    public BetRecords getRecordsByLottoId(BetRecords betRecords) {
        return dao.getByBetlottoId(betRecords);
    }

}
