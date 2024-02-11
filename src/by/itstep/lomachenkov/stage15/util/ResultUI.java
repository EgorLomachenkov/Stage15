package by.itstep.lomachenkov.stage15.util;

public class ResultUI {
    public static String formatMax(int number) {
        return String.format("The maximum is: %d", number);
    }

    public static String formatCounter(int number) {
        return String.format("The amount is: %d", number);
    }

    public static String formatPositive(boolean flag) {
        return String.format(flag ? "There are positive numbers"
                : "There aren't positive numbers");
    }

    public static String formatZero(boolean flag) {
        return String.format(flag ? "There are zero-numbers"
                : "There aren't zero-numbers");
    }

    public static String formatSaddle(int number) {
        return String.format("The amount is: %d", number);
    }

    public static String format(int[][] matrix) {
        return String.format("Matrix:\n%s", convert(matrix));
    }

    private static String convert(int[][] matrix) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                builder.append(matrix[i][j]).append(" ");
            }

            builder.append("\n");
        }

        return builder.toString();
    }
}
