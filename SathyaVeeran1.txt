import java.util.Scanner; 
class SathyaVeeran1 {
    int n;

      public SathyaVeeranSumOfSeries(int n) {
        n = n;
    }
     void sathyaveeransumofseries() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the series up to " + n + " is: " + sum);
    }
}

class SathyaVeeran {
    public static void main(String[] args) {
        int n = 5; // Example value for the series
        SathyaVeeran1 sumSeries = new SathyaVeeran1(n);
        sumSeries.calculateSum();
}
}
