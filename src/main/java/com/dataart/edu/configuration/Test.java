package com.dataart.edu.configuration;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


/**
 * Created by akuzmenko on 4/4/2017.
 */
public class Test {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
        DateTime date1 = formatter.parseDateTime("04/04/2014");
        DateTime date2 = formatter.parseDateTime("04/04/2017");

        System.out.println(isDifferenceEqualOrMoreThanYears(date1, date2, 3));

    }

    public static boolean isDifferenceEqualOrMoreThanYears(DateTime date1, DateTime date2, int years) {
        Period period = new Period(date1, date2);
        return period.getYears() == years || period.getYears() > years;
    }
}
