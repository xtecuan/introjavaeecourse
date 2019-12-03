/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.util.Calendar;

/**
 *
 * @author xtecuan
 */
public class JspCalendar {

    private Calendar c = Calendar.getInstance();

    public JspCalendar() {
    }

    public int getDayOfMonth() {
        return c.get(Calendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return c.get(Calendar.YEAR);
    }

    public int getMonth() {
        return c.get(Calendar.MONTH) + 1;
    }
}
