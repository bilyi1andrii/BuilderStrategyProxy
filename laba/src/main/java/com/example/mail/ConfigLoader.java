package com.example.mail;

import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {
    public static Properties loadConfig(String fileName) {
        Properties properties = new Properties();
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                throw new IllegalArgumentException("Unable to find properties file: " + fileName);
            }
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
}
