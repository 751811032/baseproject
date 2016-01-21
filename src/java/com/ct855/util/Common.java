package com.ct855.util;

import com.crown.util.MD5;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.sql.Clob;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.serial.SerialClob;

public class Common {

    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static Map<String, String> mCashType = new HashMap<>();

    static {
        mCashType.put("1-1", "入款");
        mCashType.put("1-2", "返水");
        mCashType.put("1-3", "公司入款");
        mCashType.put("1-4", "公司入款优惠");
        mCashType.put("1-5", "公司汇款优惠");
        mCashType.put("1-6", "线上存款");
        mCashType.put("1-7", "线上存款手续费");
        mCashType.put("1-8", "线上存款优惠");
        mCashType.put("1-9", "系统取消出款");
        mCashType.put("1-10", "其它入款");

        mCashType.put("2-1", "线上出款");
        mCashType.put("2-2", "冲销");
        mCashType.put("2-3", "重复出款");
        mCashType.put("2-4", "手动申请出款");
        mCashType.put("2-5", "放弃存款优惠");
        mCashType.put("2-6", "公司入款误存");
        mCashType.put("2-7", "会员负数回冲");
        mCashType.put("2-8", "扣除非法下注彩");
        mCashType.put("2-9", "其它出款");

        mCashType.put("3-1", "人工存入");
        mCashType.put("3-2", "人工存入取消出款");
        mCashType.put("3-3", "存款优惠");
        mCashType.put("3-4", "汇款优惠");
        mCashType.put("3-5", "负数额度归零");
        mCashType.put("3-6", "退佣优惠");
        mCashType.put("3-7", "人工其它");

        mCashType.put("4-1", "主帐户->ASC体育");
        mCashType.put("4-2", "ASC体育->主帐户");
        mCashType.put("4-3", "主帐户->PT游戏");
        mCashType.put("4-4", "PT游戏->主帐户");
        mCashType.put("4-5", "主帐户->TBS体育");
        mCashType.put("4-6", "TBS体育->主帐户");
 
        mCashType.put("5-1", "主帐户->欧博游戏");//2015-10-5 增加欧博 记录
        mCashType.put("5-2", "欧博游戏->主帐户");
    }

    /**
     * 判断变量是否为空
     *
     * @param s
     * @return
     */
    public static boolean isEmpty(String s) {
        if (null == s || "".equals(s) || "".equals(s.trim()) || "null".equalsIgnoreCase(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNumber2(String value) {
        if (isEmpty(value)) {
            return false;
        }
        String patt = "^[0-9]+(.[0-9]{1,2})?$";
        if (value.matches(patt)) {
            return true;
        } else {
            return false;
        }
    }

    public static long strToTimestamp(String value) throws ParseException {
        long time = 0;
        DateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);

        Date d = formatter.parse(value);
        ((SimpleDateFormat) formatter).applyPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String newDateString = formatter.format(d);
        Timestamp ts = Timestamp.valueOf(newDateString);
        time = ts.getTime();

        return time;
    }

    public static String timestampToStr(long time) {
        Date date = new Date(time);
        DateFormat format = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        return format.format(date);
    }

    /**
     * 使用率计算
     *
     * @return
     */
    public static String fromUsage(long free, long total) {
        if (total > 0) {
            Double d = new BigDecimal(free * 100 / total).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();

            return String.valueOf(d);
        } else {
            return "0";
        }
    }

    /**
     * 返回当前时间　格式：yyyy-MM-dd hh:mm:ss
     *
     * @return String
     */
    public static String fromDateH() {
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return format1.format(new Date());
    }

    /**
     * 返回当前时间　格式：yyyy-MM-dd
     *
     * @return String
     */
    public static String fromDateY() {
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        return format1.format(new Date());
    }

    /**
     * 用来去掉List中空值和相同项的。
     *
     * @param list
     * @return
     */
    public static List<String> removeSameItem(List<String> list) {
        List<String> difList = new ArrayList<String>();
        for (String t : list) {
            if (t != null && !difList.contains(t)) {
                difList.add(t);
            }
        }
        return difList;
    }

    /**
     * 返回用户的IP地址
     *
     * @param request
     * @return
     */
    public static String toIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    /**
     * 传入原图名称，，获得一个以时间格式的新名称
     *
     * @param fileName 原图名称
     * @return
     */
    public static String generateFileName(String fileName) {
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String formatDate = format.format(new Date());
        int random = new Random().nextInt(10000);
        int position = fileName.lastIndexOf(".");
        String extension = fileName.substring(position);
        return formatDate + random + extension;
    }

    /**
     * 取得html网页内容 UTF8编码
     *
     * @param urlStr 网络地址
     * @return String
     */
    public static String getInputHtmlUTF8(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
            HttpURLConnection httpsURLConnection = (HttpURLConnection) url.openConnection();

            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setConnectTimeout(5 * 1000);
            httpsURLConnection.connect();
            if (httpsURLConnection.getResponseCode() == 200) {
                // 通过输入流获取网络图片
                InputStream inputStream = httpsURLConnection.getInputStream();
                String data = readHtml(inputStream, "UTF-8");
                inputStream.close();
                return data;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;

    }

    /**
     * 取得html网页内容 GBK编码
     *
     * @param urlStr 网络地址
     * @return String
     */
    public static String getInputHtmlGBK(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
            HttpURLConnection httpsURLConnection = (HttpURLConnection) url.openConnection();

            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setConnectTimeout(5 * 1000);
            httpsURLConnection.connect();
            if (httpsURLConnection.getResponseCode() == 200) {
                // 通过输入流获取网络图片
                InputStream inputStream = httpsURLConnection.getInputStream();
                String data = readHtml(inputStream, "GBK");
                inputStream.close();
                return data;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

        return null;

    }

    /**
     * @param inputStream
     * @param uncode 编码 GBK 或 UTF-8
     * @return
     * @throws Exception
     */
    public static String readHtml(InputStream inputStream, String uncode) throws Exception {
        InputStreamReader input = new InputStreamReader(inputStream, uncode);
        BufferedReader bufReader = new BufferedReader(input);
        String line = "";
        StringBuilder contentBuf = new StringBuilder();
        while ((line = bufReader.readLine()) != null) {
            contentBuf.append(line);
        }
        return contentBuf.toString();
    }

    /**
     *
     * @return 返回资源的二进制数据
     * @
     */
    public static byte[] readInputStream(InputStream inputStream) {

        // 定义一个输出流向内存输出数据
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        // 定义一个缓冲区
        byte[] buffer = new byte[1024];
        // 读取数据长度
        int len = 0;
        // 当取得完数据后会返回一个-1
        try {
            while ((len = inputStream.read(buffer)) != -1) {
                // 把缓冲区的数据 写到输出流里面
                byteArrayOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        // 得到数据后返回
        return byteArrayOutputStream.toByteArray();

    }
    // 磁盘读写初始数据 用于计算读写速率
    private static Map<String, String> diskWritesAndReadsOnInit = new HashMap<String, String>();
    private static long initTime;

    /**
     * 获取当前认证通过的用户名
     *
     * @return
     */
    public static String getAuthenticatedUsername() {
        String username = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }
        return username;
    }

    /*
     * 获取本机IP
     * @Auther neville
     */
    public static String getLocalIP() {
        String sIP = "";
        InetAddress ip = null;
        try {
            //如果是Linux操作系统
            boolean bFindIP = false;
            Enumeration netInterfaces = (Enumeration) NetworkInterface.getNetworkInterfaces();
            while (netInterfaces.hasMoreElements()) {
                if (bFindIP) {
                    break;
                }
                NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
                Enumeration ips = ni.getInetAddresses();//遍历所有ip
                while (ips.hasMoreElements()) {
                    ip = (InetAddress) ips.nextElement();
                    if (!ip.isLoopbackAddress() && !ip.getHostAddress().contains(":")) {//127.开头的都是lookback地址                      
                        if (ip.getHostAddress().startsWith("192.168.1")) {
                            bFindIP = true;
                            break;
                        }
                    }
                }
            }

        } catch (Exception e) {

        }
        if (null != ip) {
            sIP = ip.getHostAddress();
        }
        return sIP;
    }

    /**
     * 拆分数字
     *
     * @param str
     * @param n
     * @return
     */
    public static String splitNumber(String str, int n) {

        int b = 0;
        String s = "";
        while (b < str.length()) {
            s += Integer.parseInt(str.substring(b, b + n)) + ",";
            b = b + n;
        }
        return s.substring(0, s.length() - 1);
    }

 
    // 将byte数组转换成InputStream  
    public static InputStream byteTOInputStream(byte[] in) throws Exception {

        ByteArrayInputStream is = new ByteArrayInputStream(in);

        return is;

    }

    /*
     clob to string
     大字符串格式转换STRING
     @param clob
     @return 大字符串
    
     */
    public static String Clob2String(Clob clob) {// Clob转换成String 的方法
        String content = "";
        try {
            content = clob.getSubString(1, (int) clob.length()); //clob 转 String
        } catch (SQLException ex) {
            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
        }
        return content;
    }

    public static Clob String2Clob(String str) {
        Clob c = null;
        try {
            c = new SerialClob(str.toCharArray());
        } catch (SQLException ex) {
            Logger.getLogger(Common.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    @SuppressWarnings("CallToThreadDumpStack")
    public static Date str2Date(String dateStr, String format) {
        try {
            if (format != null && !format.isEmpty()) {
                format = DEFAULT_DATE_FORMAT;
            }

            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.parse(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Date(); // 发生错误则返回当前时间
    }

    public static String date2Str(Date date, String format) {
        if (format != null && !format.isEmpty()) {
            format = DEFAULT_DATE_FORMAT;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    // 传入的小时可以为任何整数
    public static Date changeDate(Date srcDate, int hourOffset) {
        if (srcDate == null) {
            srcDate = new Date();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(srcDate);
        calendar.add(GregorianCalendar.HOUR_OF_DAY, hourOffset);
        return calendar.getTime();
    }

    public static Date getBeiJinTime() {
        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        return calendar1.getTime();
    }

    public static String getWebAPI(String pat) {
        String content = "";

        String url = System.getProperty("MEMBER_URL") + pat;
        System.out.println("请求web api信息：" + url);
        content = Common.getInputHtmlUTF8(url);
        //System.out.println("请求web api返回信息：" + content);

        return content;

    }

    private static File file;
    private static IPSeeker ipSeeker;

    public static String getIPCountry(String ip, String contexpath) {
        try {
            if (file == null) {
                //URL url = SysConstant.class.getResource(System.getProperty("file.separator")+"QQWry1.Dat");
                // System.out.println(contexpath+"QQWry1.Dat");

                file = new File(contexpath + "QQWry1.Dat");
            }
            if (ipSeeker == null) {
                ipSeeker = new IPSeeker(file);
            }
            return ipSeeker.getCountry(ip);
        } catch (Exception e) {
            return ip;
        }
    }

    public static String getIPArea(String ip, String contexpath) {
        try {
            if (file == null) {
                //URL url = SysConstant.class.getResource(System.getProperty("file.separator")+"QQWry1.Dat");
                //file = new File(url.toURI());
                file = new File(contexpath + "/QQWry1.Dat");
            }
            if (ipSeeker == null) {
                ipSeeker = new IPSeeker(file);
            }
            if (!isEmpty(ip)) {
                return ipSeeker.getArea(ip);
            } else {
                return "";
            }
        } catch (Exception e) {
            return ip;
        }
    }

}
