/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.service;

import com.ct855.entity.BetRecords;

/**
 *
 * @author USER
 */
public interface BetRecordsService {
    public int add(BetRecords betRecords);//投注
    public int cancelOrder(BetRecords betRecords);
    public int winOrder(BetRecords betRecords);
    public int returnPoints(BetRecords betRecords);
    public BetRecords getRecordsByLottoId(BetRecords betRecords);
}
