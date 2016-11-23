/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_4_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kate_
 */
public class DateHelper {

    private Calendar startDate = Calendar.getInstance();
    private Calendar currentDate = Calendar.getInstance();
    private static final int DURATION = 45;

    public String getFormattedStartDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm");
        return sdf.format(startDate.getTime());
    }

    public void skipTime() {
        currentDate.add(Calendar.MINUTE, DURATION);
    }

    public String getFormattedDiff() {
        Calendar distinct = Calendar.getInstance();
        distinct.setTime(new Date(currentDate.getTime().getTime() - startDate.getTime().getTime()));
//        String str = str;
        return (distinct.get(Calendar.HOUR_OF_DAY) - 4) + ":" + 
                distinct.get(Calendar.MINUTE);
    }
}
