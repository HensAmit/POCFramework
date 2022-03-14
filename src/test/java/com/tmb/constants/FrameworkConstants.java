package com.tmb.constants;

public final class FrameworkConstants {

    private FrameworkConstants(){}

    private static final String CONFIG_FILE_PATH = "src/test/resources/config/config.properties";
    private static final int WAIT_TIME_IN_SECONDS = 10;
    private static final String LOGINTEST_EXCEL_FILE_PATH = "src//test//java//com//tmb//dataproviders//inputexcels//LoginTestDataProvider.xlsx";
    private static final String HOMEPAGETEST_EXCEL_FILE_PATH = "src//test//java//com//tmb//dataproviders//inputexcels//HomePageTestDataProvider.xlsx";

    public static String getConfigFilePath(){
        return CONFIG_FILE_PATH;
    }

    public static int getWaitTimeInSeconds(){
        return WAIT_TIME_IN_SECONDS;
    }

    public static String getLoginTestExcelFilePath(){
        return LOGINTEST_EXCEL_FILE_PATH;
    }

    public static String getHomePageTestExcelFilePath(){
        return HOMEPAGETEST_EXCEL_FILE_PATH;
    }
}
