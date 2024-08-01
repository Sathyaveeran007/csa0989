class sathyaveeran2 {
     int sum;

    sathyaveeran2(int n) {
        sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
    }

     void sathya() {
        System.out.println("Sum of series: " + sum);
    }

    public static void main(String[] args) {
        sathyaveeran2 series = new sathyaveeran2(10);
        series.displaysathya();
    }
}
