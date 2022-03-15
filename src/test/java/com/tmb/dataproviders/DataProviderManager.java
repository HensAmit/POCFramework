package com.tmb.dataproviders;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataProviderManager {
    public static Object[][] getDataProvider(String xlsxFilePath, String sheetName){
        File file = new File(xlsxFilePath);
        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("FILE NOT FOUND AT : "+xlsxFilePath);
        }

        XSSFWorkbook workbook;
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("FAILED TO READ FILE : "+xlsxFilePath);
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);

        int rowNum = sheet.getLastRowNum();
        int colNum = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowNum][1];
        Map<String, String> map;

        for(int i=1; i<=rowNum; i++){
            map = new LinkedHashMap<>();
            for(int j=0; j<colNum; j++){
                String key = sheet.getRow(0).getCell(j).getStringCellValue();
                String value = sheet.getRow(i).getCell(j).getStringCellValue();
                map.put(key, value);
            }
            data[i-1][0] = map;
        }
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("UNABLE TO CLOSE WORKBOOK : "+xlsxFilePath);
        }
        return data;
    }
}
