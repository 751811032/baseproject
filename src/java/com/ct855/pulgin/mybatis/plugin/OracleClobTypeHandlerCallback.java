/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.pulgin.mybatis.plugin;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.sql.CLOB;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 *
 * @author RSN GROUP
 */
public class OracleClobTypeHandlerCallback implements TypeHandler<Object> {

    @Override
    public void setParameter(PreparedStatement arg0, int arg1, Object arg2, JdbcType arg3) throws SQLException {
        CLOB clob = CLOB.empty_lob();
        clob.setString(1, (String) arg2);
        arg0.setClob(arg1, clob);
    }

    @Override
    public Object getResult(ResultSet arg0, String arg1) throws SQLException {
        CLOB clob = (CLOB) arg0.getClob(arg1);
        return (clob == null || clob.length() == 0) ? null : clob.getSubString((long) 1, (int) clob.length());
    }

    @Override
    public Object getResult(ResultSet rs, int i) throws SQLException {
        return null;
    }

    @Override
    public Object getResult(CallableStatement cs, int i) throws SQLException {
        return null;
    }

    public Object valueOf(String param) {
        return null;
    }

}
