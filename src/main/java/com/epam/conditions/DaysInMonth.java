package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }
        switch (month) {
            case 2 -> System.out.println(isLeapYear(year) ? 29 : 28);
            case 4, 6, 9, 11 -> System.out.println(30);
            default -> System.out.println(31);
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
