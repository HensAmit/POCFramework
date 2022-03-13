package com.tmb.constants;

public final class FrameworkConstants {

    private FrameworkConstants(){}

    private static final String CONFIG_FILE_PATH = "src/test/resources/config/config.properties";

    public static String getConfigFilePath(){
        return CONFIG_FILE_PATH;
    }
}
