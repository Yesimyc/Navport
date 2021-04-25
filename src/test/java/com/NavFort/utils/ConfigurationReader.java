package com.NavFort.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFile;

    static {
        try {

            FileInputStream fileInputStream = new FileInputStream("configuration.properties");

            configFile = new Properties();
            configFile.load(fileInputStream);
            fileInputStream.close();

        } catch (IOException e) {
            System.out.println("File was not loaded:(");
            e.printStackTrace();
        }


    }
    public static String getProperty(String Key){
        return configFile.getProperty(Key)  ;
    }
}
