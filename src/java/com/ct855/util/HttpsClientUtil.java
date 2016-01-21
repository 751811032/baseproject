/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.commons.httpclient.HttpClient;

/**
 *
 * @author RSN GROUP
 */
public class HttpsClientUtil {

    public static String postUrl(String url, Map<String, String> params) throws IOException, NoSuchAlgorithmException, KeyManagementException, NoSuchProviderException {
        //创建SSLContext对象，并使用我们指定的信任管理器初始化
        TrustManager[] trustAllCerts = new TrustManager[]{new MyX509TrustManager()};
        SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

//从上述SSLContext对象中得到SSLSocketFactory对象
        SSLSocketFactory ssf = sslContext.getSocketFactory();
        String data = "";
        for (String key : params.keySet()) {
            data += "&" + URLEncoder.encode(key, "UTF-8") + "=" + URLEncoder.encode(params.get(key), "UTF-8");
        }
        data = data.substring(1);

        System.out.println("postUrl=>data:" + data);
        URL aURL = new java.net.URL(url);
        HttpsURLConnection aConnection = (HttpsURLConnection) aURL.openConnection();
        aConnection.setSSLSocketFactory(ssf);
        aConnection.setDoOutput(true);
        aConnection.setDoInput(true);
        aConnection.setRequestMethod("POST");
        OutputStreamWriter streamToAuthorize = new java.io.OutputStreamWriter(aConnection.getOutputStream());
        streamToAuthorize.write(data);
        streamToAuthorize.flush();
        streamToAuthorize.close();
        InputStream resultStream = aConnection.getInputStream();
        BufferedReader aReader = new java.io.BufferedReader(new java.io.InputStreamReader(resultStream));
        StringBuffer aResponse = new StringBuffer();
        String aLine = aReader.readLine();
        while (aLine != null) {
            aResponse.append(aLine + "\n");
            aLine = aReader.readLine();
        }
        resultStream.close();
        return aResponse.toString();
    }

    public static String testIt(String https_url, Map<String, String> map, String method) throws NoSuchAlgorithmException, NoSuchProviderException, KeyManagementException {

        //创建SSLContext对象，并使用我们指定的信任管理器初始化
        TrustManager[] trustAllCerts = new TrustManager[]{new MyX509TrustManager()};
        SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

//从上述SSLContext对象中得到SSLSocketFactory对象
        SSLSocketFactory ssf = sslContext.getSocketFactory();

        URL url;
        try {

            url = new URL(https_url);

            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setRequestMethod(method);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                con.setRequestProperty(entry.getKey(), entry.getValue());
            }

            con.setSSLSocketFactory(ssf);
            //dumpl all cert info
            //print_https_cert(con);
            //dump all the content
            return print_content(con);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void print_https_cert(HttpsURLConnection con) {

        if (con != null) {

            try {

                System.out.println("Response Code : " + con.getResponseCode());
                System.out.println("Cipher Suite : " + con.getCipherSuite());
                System.out.println("\n");

                Certificate[] certs = con.getServerCertificates();
                for (Certificate cert : certs) {
                    System.out.println("Cert Type : " + cert.getType());
                    System.out.println("Cert Hash Code : " + cert.hashCode());
                    System.out.println("Cert Public Key Algorithm : "
                            + cert.getPublicKey().getAlgorithm());
                    System.out.println("Cert Public Key Format : "
                            + cert.getPublicKey().getFormat());
                    System.out.println("\n");
                }

            } catch (SSLPeerUnverifiedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private static String print_content(HttpsURLConnection con) {
        if (con != null) {

            try {

                System.out.println("****** Content of the URL ********");
                BufferedReader br
                        = new BufferedReader(
                                new InputStreamReader(con.getInputStream()));

                String input;

                while ((input = br.readLine()) != null) {
                    System.out.println(input);
                }
                br.close();
                return input;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public static String getUrl(String url) throws IOException, NoSuchAlgorithmException, KeyManagementException, NoSuchProviderException {
        //创建SSLContext对象，并使用我们指定的信任管理器初始化
        TrustManager[] trustAllCerts = new TrustManager[]{new MyX509TrustManager()};
        SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

//从上述SSLContext对象中得到SSLSocketFactory对象
        SSLSocketFactory ssf = sslContext.getSocketFactory();

        URL aURL = new java.net.URL(url);
        HttpsURLConnection aConnection = (HttpsURLConnection) aURL.openConnection();
        aConnection.setRequestProperty("Ocp-Apim-Subscription-Key", "d8400b4cdf104015bb23d7fe847352c8");
        aConnection.setSSLSocketFactory(ssf);
        aConnection.setDoOutput(true);
        aConnection.setDoInput(true);
        aConnection.setRequestMethod("GET");

        InputStream resultStream = aConnection.getInputStream();
        BufferedReader aReader = new java.io.BufferedReader(new java.io.InputStreamReader(resultStream));
        StringBuffer aResponse = new StringBuffer();
        String aLine = aReader.readLine();
        while (aLine != null) {
            aResponse.append(aLine + "\n");
            aLine = aReader.readLine();
        }
        resultStream.close();
        return aResponse.toString();
    }

    public static void main(String[] args) {

        try {
            String ss = "--->>" + HttpsClientUtil.getUrl("https://api.fantasydata.net/nba/v2/JSON/teams");
            System.out.println(ss);
        } catch (IOException iOException) {
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        } catch (KeyManagementException keyManagementException) {
        } catch (NoSuchProviderException noSuchProviderException) {
        }

    }
}
