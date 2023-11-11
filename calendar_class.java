package com.company;

import java.util.Calendar;

public class calendar_class {
    public static void main(String[] args) {
        Calendar c =  Calendar.getInstance();
        System.out.println(c.getWeeksInWeekYear());
        System.out.println("the max no of weeks"+ c.getMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("the max no of weeks"+ c.getMaximum(Calendar.YEAR));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
                System.out.println("Current year is :"+ c.get(Calendar.YEAR));
                System.out.println("Current month is :"+ c.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]
                System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK));
                System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY));
                System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
                System.out.println("Current second is :"+ c.get(Calendar.SECOND));

        System.out.println("the current time"+ c.getTime());
                c.add(Calendar.YEAR,5);
        System.out.println("after 5 years"+c.getTime());



            }
        }



