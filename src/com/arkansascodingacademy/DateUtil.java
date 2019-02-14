package com.arkansascodingacademy;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

@SuppressWarnings("WeakerAccess")
public class DateUtil
{
    //Return a LocalDate object for New Years of the given year
    public static LocalDate getNewYears(int year)
    {
        return LocalDate.of(year, 1, 1);
    }

    //Return a LocalDate object for Christmas of the given year
    public static LocalDate getChristmas(int year)
    {
        return LocalDate.of(year, 12, 25);
    }

    //In 1999 it is time to party
    //If the given year is 1999 return true
    public static boolean isPartyTime(LocalDate date)
    {
        boolean isPartTime = false;
        if (date.getYear()== 1999)
        {
            isPartTime = true;
        }
        return isPartTime;
    }

    //After 1999 you are out of time
    //If the given year is after 1999 return true
    public static boolean isOutOfTime(LocalDate date)
    {
        boolean outOfTime = false;
        if (date.getYear() > 1999)
        {
            outOfTime = true;
        }
        return outOfTime;
    }

    //You took too long to order your soup
    //You cannot try again for one year
    //Return the given date one year from now
    public static LocalDate getSoupDay(LocalDate date)
    {
        return date.plusYears(1);
    }

    //Return a LocalDate object for the next Christmas after the given date
    public static LocalDate getNextChristmas(LocalDate date)
    {
        LocalDate christmasSameYear = LocalDate.of(date.getYear(), 12, 25);
        LocalDate christmasNextYear = LocalDate.of(date.getYear() + 1, 12, 25);


        LocalDate nextChristmas;

        if (date.isBefore(christmasSameYear))
        {
            nextChristmas = christmasSameYear;
        }
        else
        {
            nextChristmas = christmasNextYear;
        }

        return nextChristmas;
    }

    //Return the number of days until Christmas
    //If it is Christmas return the number of days until the next Christmas
    public static long getDaysUntilChristmas(LocalDate date)
    {

        Long daysUntilChristmas = new Long(0);
        LocalDate christmasDay = LocalDate.of(date.getYear(),12, 25);
        LocalDate christmasDayNextYear = LocalDate.of(date.getYear() + 1,12, 25);

        if (date.isBefore(christmasDay))
        {
            daysUntilChristmas = DAYS.between(date, christmasDay);
        }
        else
        {
            daysUntilChristmas = DAYS.between(date, christmasDayNextYear);
        }

        return daysUntilChristmas;
    }

    //Return a array of twelve ints holding the number of days in each month
    public static int[] daysInMonth(int year)
    {
        return null;
    }
}
