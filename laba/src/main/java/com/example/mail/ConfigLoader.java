package com.example.mail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {
    public static Properties loadConfig(String fileName) {
        Properties properties = new Properties();
        try (InputStream INPUT = ConfigLoader
                                 .class.getClassLoader()
                                 .getResourceAsStream(fileName)) {
            if (INPUT == null) {
                throw new IllegalArgumentException("Can't find props: "
                + fileName);
            }
            properties.load(INPUT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
