package com.tmb.helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Helper {

    private Helper(){}

    public static String getCurrentTimeStamp(){
        return new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());
    }
}
