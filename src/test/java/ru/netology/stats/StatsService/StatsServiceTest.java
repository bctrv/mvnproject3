package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void allSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAllSales = 180;
        int actualallSales = service.allSales(sales);

        Assertions.assertEquals(expectedAllSales, actualallSales);
    }

    @Test
    public void avgSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAvgSales = 15;
        int actualAvgSales = service.avgSales(sales);

        Assertions.assertEquals(expectedAvgSales, actualAvgSales);
    }

    @Test
    public void maxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSalesMonth = 7;
        int actualMaxSalesMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);
    }

    @Test
    public void minSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSalesMonth = 8;
        int actualMinSalesMonth = service.minSalesMonth(sales);

        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);
    }

    @Test
    public void lowAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedlowAvg = 5;
        int actuallowAvg = service.lowAvg(sales);

        Assertions.assertEquals(expectedlowAvg, actuallowAvg);
    }

    @Test
    public void highAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedhighAvg = 5;
        int actualhighAvg = service.highAvg(sales);

        Assertions.assertEquals(expectedhighAvg, actualhighAvg);
    }
}

