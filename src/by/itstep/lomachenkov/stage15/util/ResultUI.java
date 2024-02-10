package by.itstep.lomachenkov.stage15.util;

public class ResultUI {
    public static String format(int number) {
        return String.format("The maximum is: %d", number);
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
