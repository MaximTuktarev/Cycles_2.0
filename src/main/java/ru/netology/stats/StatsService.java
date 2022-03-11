package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;

        }
        return sum;

    }

    public long calculateAverage(long[] sales) {
        return calculateSum(sales) / sales.length;


    }


    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long belowMedium(long[] sales) {
        long avg = calculateAverage(sales);
        int months = 0;
        for (long sale : sales)
            if (sale <= avg) {
                months = months + 1;
            }
        return months;

    }

    public long aboveMedium(long[] sales) {
        long avg = calculateAverage(sales);
        int months = 0;
        for (long sale : sales)
            if (sale >= avg) {
                months = months + 1;
            }
        return months;


    }
}

