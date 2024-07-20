package com.vyku.technical_Round_Practice;

public class _01LeapYear
{
    public static void main(String[] args)
    {
        _01LeapYear.checkLeapYear(2020);
    }
    static void checkLeapYear(int year)
    {
        if(year%400==0 || (year%4 ==0 && year%100!=0 ))
        {
            System.out.println(year+" given number is leap year");
        }
        else
        {
            System.out.println(year +" given year is not a leap year" );
        }

    }
}
