/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ct855.util;

import java.io.IOException;
import java.util.Properties;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;


/**
 * 配置为不同的环境
 *
 * @author Administrator
 */
public class PropertyConfigurer extends PropertyPlaceholderConfigurer {

    //private final static Logger logger = LogManager.getLogger     (PropertyConfigurer.class);
    // private static Map<String, Object> ctxPropertiesMap;
    @Override
    public void setLocations(Resource[] locations) {
        super.setLocations(locations); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLocation(Resource location) {

        FileSystemResourceLoader resourceLoader = new FileSystemResourceLoader();
        String ip = Common.getLocalIP();
        String props = "/config_test.properties";
        if ("192.168.1.10".equals(ip)) {
            location = resourceLoader.getResource("classpath:jdbc.properties");
            props = "/config.properties";
            this.logger.warn("ag server live:" + ip);
        } else {
            location = resourceLoader.getResource("classpath:jdbc_test.properties");
            this.logger.warn("ag server test:" + ip);
        }
        final Properties propsFromFile = new Properties();
        try {
            propsFromFile.load(getClass().getResourceAsStream(props));

        } catch (final IOException e) {
            logger.error(e.getMessage(), e);
        }
        for (String prop : propsFromFile.stringPropertyNames()) {
            if (System.getProperty(prop) == null) {
                System.setProperty(prop, propsFromFile.getProperty(prop));
            }
        }
        super.setLocation(location);
    }
}
