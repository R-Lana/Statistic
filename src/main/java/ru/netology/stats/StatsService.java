
package ru.netology.stats;

public class StatsService {

    public int salesAmount(int[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public int middleSales(int[] sales) {
        int middle = salesAmount(sales) / sales.length;
        return middle;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int underMiddle(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale < middleSales(sales)) {
                month = month + 1;
            }

        }
        return month;
    }

    public int upperMiddle(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale > middleSales(sales)) {
                month = month + 1;
            }

        }
        return month;
    }
}
