package eu.shindapp.synthmoon.utils;

import io.github.cdimascio.dotenv.Dotenv;

public class ConfigUtils {

    private static final Dotenv dotenv = Dotenv.load();

    public static String getConfig(String string) {
        return dotenv.get(string);
    }
}
