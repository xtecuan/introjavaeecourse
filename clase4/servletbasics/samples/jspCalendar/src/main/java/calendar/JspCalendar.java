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

    private int day;

    private int month;

    private int year;

    private Calendar c = Calendar.getInstance();

    public JspCalendar() {
    }

    public JspCalendar(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.c.set(year, month - 1, day);
    }

    public int getDayOfMonth() {
        return c.get(Calendar.DAY_OF_MONTH);
    }

    public int getMonth() {
        return c.get(Calendar.MONTH) + 1;
    }

    public int getYear() {
        return c.get(Calendar.YEAR);
    }

}
