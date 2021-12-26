import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calcSumm() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calcSumm(sales);
        assertEquals(180, actual);
    }

    @Test
    void calculateAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateAverage(sales);
        assertEquals(15, actual);
    }

    @Test
    void findMax() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMax(sales);
        assertEquals(8, actual);
    }

    @Test
    void findMin() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMin(sales);
        assertEquals(9, actual);
    }

    @Test
    void findBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findBelowAverage(sales);
        assertEquals(5, actual);
    }

    @Test
    void findAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findAboveAverage(sales);
        assertEquals(5, actual);
    }
}