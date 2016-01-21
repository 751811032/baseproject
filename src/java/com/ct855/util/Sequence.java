/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.log4j.Logger;

/**
 *
 * @author RSN GROUP
 */
public class Sequence {

    private static org.apache.log4j.Logger log = Logger.getLogger(Sequence.class);
    private static boolean isInit = false;
    private static long initSeq = 1000L;

    /**
     *
     * @return
     */
    public synchronized static final long getNextVal(String contexpath) throws Exception {
        long tmp = getCurrVal(contexpath);
        log.trace("tmp:" + tmp);
        writeVal(++tmp,contexpath);
        return getCurrVal(contexpath);
    }

    /**
     *
     * @return
     */
    public synchronized static final long getCurrVal(String contexpath) throws Exception {
        if (!isInit) {
            try {
                readVal(contexpath);
            } catch (Exception e) {
                writeVal(initSeq,contexpath);
            }
        }
        isInit = true;
        return readVal(contexpath);
    }

    /**
     *
     * @return
     */
    private synchronized static final void writeVal(long val,String contexpath) throws Exception {
        FileOutputStream fos = new FileOutputStream(contexpath + "javaSequence.ser");
        //FileOutputStream fos = new FileOutputStream(userDir + "\\src\\javaSequence.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Long(val));
        oos.close();
    }

    private synchronized static final long readVal(String contexpath) throws Exception {
        FileInputStream fis = new FileInputStream(contexpath + "javaSequence.ser");
        // FileInputStream fis = new FileInputStream(userDir + "\\src\\javaSequence.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Long seq = (Long) ois.readObject();
        ois.close();
        return seq;
    }

}
