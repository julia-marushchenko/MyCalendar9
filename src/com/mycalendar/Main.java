/**
 *  Java program to demonstrate GregorianCalendar class.
 */

package com.mycalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *  Main class.
 */
public class Main {

    // Main method to start java program.
    public static void main(String[] args) {

        // Creating GregorianCalendar object with year, month, dayOfMonth, hourOfDay, minute, and second.
        GregorianCalendar myDate = new GregorianCalendar(2026, 7, 12,
                11, 41, 55);

        // Printing information about created date.
        System.out.println("Type of calendar: " + myDate.getCalendarType() + "\nYear: " + myDate.get(Calendar.YEAR) +
                "\nMonth: " + myDate.get(Calendar.MONTH) + "\nDay: " + myDate.get(Calendar.DATE) + "\nHour of the day: "
        + myDate.get(Calendar.HOUR) + "\nMinutes: " + myDate.get(Calendar.MINUTE) + "\nSeconds: " +
                myDate.get(Calendar.SECOND));

    }
}