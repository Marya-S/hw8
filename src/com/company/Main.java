package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("****Задание 1*********");
        int year = 1600;
        if (checkYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("****Задание 2*********");
        int osType = 0;
        int produceYear = 2022;
        checkVersion(osType, produceYear);

        System.out.println("****Задание 3*********");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + countDeliveryDays(deliveryDistance) + " дней");
    }

    public static boolean checkYear(int year) {
        if (year % 4 == 0 && (!(year % 100 == 0) || (year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkVersion(int osType, int produceYear) {
        int currentYear = LocalDate.now().getYear();
        if (osType == 0 && produceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osType == 0 && produceYear < currentYear) {
            System.out.println("Установите lite версию приложения для iOS по ссылке");
        } else if (osType == 1 && produceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (osType == 1 && produceYear < currentYear) {
            System.out.println("Установите lite версию приложения для Android по ссылке");
        } else if (produceYear > currentYear) {
            System.out.println("Неверный год производства");
        }
    }

    public static int countDeliveryDays(int distance) {
        int day = 0;
        if (distance < 20) {
            day += 1;
        } else if (distance >= 20 && distance < 60) {
            day += 2;
        } else if (distance >= 60 && distance < 100) {
            day += 3;
        } else if (distance >= 100) {
            day += 4;
        }
        return day;
    }
}
