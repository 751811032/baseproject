package com.ct855.util;

import java.math.BigDecimal;

/**
 * 浮点数工具类
 *
 * @author dell
 */
public class BaseCalculate {

    private static final int DEF_DIV_SCALE = 10;

    /**
     * 提供精确的加法运算
     *
     * @param v1 被加数
     * @param v2 加数
     * @return 两个参数的和
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确的减法运算
     *
     * @param v1 被减数
     * @param v2 减数
     * @return 两个参数的差
     */
    public static double substract(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算
     *
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static double multiply(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 提供（相对）精确的除法运算,当发生除不尽的情况时, 精确到小数点以后10位,以后的数字四舍五入.
     *
     * @param v1 被除数
     * @param v2 除数
     * @return 两个参数的商
     */
    public static double divide(double v1, double v2) {
        return divide(v1, v2, DEF_DIV_SCALE);
    }

    /**
     * 提供（相对）精确的除法运算. 当发生除不尽的情况时,由scale参数指 定精度,以后的数字四舍五入.
     *
     * @param v1 被除数
     * @param v2 除数
     * @param scale 表示需要精确到小数点以后几位
     * @return 两个参数的商
     */
    public static double divide(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }

        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 提供精确的小数位四舍五入处理
     *
     * @param v 需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static double round(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }

        BigDecimal b = new BigDecimal(Double.toString(v));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 汇率转换(取整)
     *
     * @param i 被除数
     * @param rate 除数
     * @return
     */
    public static double converter(double i, double rate) {
        return Math.rint(i / rate);
    }

    /**
     * 两数相等判断
     *
     * @param i 被除数
     * @param rate 除数
     * @return
     */
    public static boolean isEqual(double v1, double v2) {
        return Math.abs(v1 - v2) < 0.00000001;
    }

    public static void main(String[] args) {
        //直接使用浮点数进行计算，得到的结果是有问题的
        System.out.println(0.01 + 0.05);
        System.out.println(0.01 + 0.05-0.06);
        System.out.println(isEqual((0.01 + 0.05), 0.06));
        // 使用了BigDecimal类进行计算后，可以做到精确计算
        //System.out.println(BaseCalculate.multiply(0.01, 0.05));

        System.out.println(add(0.0000000000005, 0.00000001));
    }
}
