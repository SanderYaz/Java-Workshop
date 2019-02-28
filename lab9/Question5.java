public class Question5 {
    private static double calculateAverage(int[][] values) {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                sum += values[i][j];
                count++;

            }
        }
        return sum / count;
    }

    public static void main(String[] args) {
        int[][] values = { { 4, 7, 8, }, { 6 }, { 2, 3 } };
        System.out.println(calculateAverage(values));
    }
}