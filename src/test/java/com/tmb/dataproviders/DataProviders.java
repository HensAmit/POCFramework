package com.tmb.dataproviders;

import com.tmb.constants.FrameworkConstants;
import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider (parallel = true)
    public static Object[][] loginTest1Data() {
        return DataProviderManager.getDataProvider(FrameworkConstants.getLoginTestExcelFilePath(),"loginTest1");
    }

    @DataProvider (parallel = true)
    public static Object[][] loginTest2Data(){
        return DataProviderManager.getDataProvider(FrameworkConstants.getLoginTestExcelFilePath(),"loginTest2");
    }

    @DataProvider (parallel = true)
    public static Object[][] homePageTest1Data(){
        return DataProviderManager.getDataProvider(FrameworkConstants.getHomePageTestExcelFilePath(),"homePageTest1");
    }

    @DataProvider (parallel = true)
    public static Object[][] homePageTest2Data(){
        return DataProviderManager.getDataProvider(FrameworkConstants.getHomePageTestExcelFilePath(),"homePageTest2");
    }
}
