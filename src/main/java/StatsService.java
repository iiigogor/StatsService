public class StatsService {
    public int calculateSumm(int[] sales) {
        int summ = 0;
        for (int sale : sales) {
            summ += sale;
        }
        return summ;
    }

    public int calculateAverage(int[] sales) {
        int summ = 0;
        for (int sale : sales) {
            summ += sale;
        }
        int avrg = (summ / sales.length);
        return avrg;
    }

    public int findMax(int[] sales) {
        int month = 0;
        int currentMax = sales[0];
        for (int sale : sales) {
            if (sale >= sales[currentMax]) {
                currentMax = month;
            }
            month = month + 1;
        }
        return currentMax + 1;
    }

    public int findMin(int[] sales) {
        int currentMin = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[currentMin]) {
                currentMin = month;
            }
            month = month + 1;
        }
        return currentMin + 1;
    }

    public int findBelowAverage(int[] sales) {
        int number = 0;
        int summ = 0;
        for (int sale : sales) {
            summ += sale;
        }
        int avrg = (summ / sales.length);
        for (int sale : sales) {
            if (sale < avrg) {
                number += 1;
            }
        }
        return number;
    }

    public int findAboveAverage(int[] sales) {
        int number = 0;
        int summ = 0;
        for (int sale : sales) {
            summ += sale;
        }
        int avrg = (summ / sales.length);
        for (int sale : sales) {
            if (sale > avrg) {
                number += 1;
            }
        }
        return number;
    }
}
