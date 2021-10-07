package com.hotel;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class HotelKey {

    public static void main(String[] args){
        String key = "H211004-AA-0001";
        String s1 = "AA";
        String s2 = "0001";
        // current date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
        Date date = new Date();
        String format = dateFormat.format(date);
        System.out.print("\nCurrent Date: " + dateFormat.format(date));

        int parseInt = Integer.parseInt(s2);
        DecimalFormat decimalFormat = new DecimalFormat("0000");
        System.out.print("\nCode Format: " + decimalFormat.format(parseInt));
        int s3 = Integer.parseInt(decimalFormat.format(parseInt));

        String incrementStr = new String();
        for(int i=0; i<s1.length(); i++){
            incrementStr = (incrementStr + (s1.charAt(i) + 1));
        }
        System.out.print("\n" + incrementStr);

        for(int i=1; i<9999; i++){
            s3= s3+1;
        }
        String s = "";

            s = "H" + format + "-" + s1 + "-" + s3;

        System.out.print("\n" + s);

    }
}
