package ru.netology.stats.StatsService;

public class StatsService {
    public int allSales(int[] sales) {
        int allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[i];
        }
        return allSales;
    }

    public int avgSales(int[] sales) {
        int avgSales = allSales(sales) / sales.length;
        return avgSales;
    }

    public int maxSalesMonth(int[] sales) {
        int maxSalesMonth = 0;
        for (int m = 0; m < sales.length; m++) {
            if (sales[m] >= sales[maxSalesMonth]) {
                maxSalesMonth = m;
            }
        }
        return maxSalesMonth;
    }

    public int minSalesMonth(int[] sales) {
        int minSales = 0;
        for (int m = 0; m < sales.length; m++) {
            if (sales[m] <= sales[minSales]) {
                minSales = m;
            }
        }
        return minSales;
    }

    public int lowAvg(int[] sales) {
        int avg = avgSales(sales);
        int lowAvg = 0;
        for (int i : sales) {
            if (i < avg) {
                lowAvg++;
            }
        }
        return lowAvg;
    }

    public int highAvg(int[] sales) {
        int avg = avgSales(sales);
        int highAvg = 0;
        for (int i : sales) {
            if (i > avg) {
                highAvg++;
            }
        }
        return highAvg;
    }
}
