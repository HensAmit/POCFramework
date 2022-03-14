package com.tmb.utils;

import com.tmb.constants.FrameworkConstants;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public final class ExcelUtils {

    private ExcelUtils(){}

    public static List<Map<String,String>> getTestDetails(){

        List<Map<String,String>> list = new ArrayList<>();
        FileInputStream fis;
        XSSFWorkbook workbook;
        try {
            fis = new FileInputStream(FrameworkConstants.getRunnerExcelPath());
            workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("RunManager");

            Map<String,String> map;
            int lastRowNum = sheet.getLastRowNum();
            int lastColNum = sheet.getRow(0).getLastCellNum();

            for(int i=1; i<=lastRowNum; i++){
                map = new HashMap<>();
                for(int j=0; j<lastColNum; j++){
                    String key = sheet.getRow(0).getCell(j).getStringCellValue();
                    String value = sheet.getRow(i).getCell(j).getStringCellValue();
                    map.put(key, value);
                }
                list.add(map);
            }
            fis.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("UNABLE TO READ EXCEL FILE : "+FrameworkConstants.getRunnerExcelPath());
        }

        return list;
    }
}
