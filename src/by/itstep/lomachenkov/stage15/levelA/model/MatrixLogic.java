package by.itstep.lomachenkov.stage15.levelA.model;

public class MatrixLogic {
    public static int getMaxAboveMainDiagonal(int[][] matrix) {
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > i) {
                    max = max < matrix[i][j] ? matrix[i][j] : max;
                }
            }
        }

        return max;
    }

    public static int getMaxUnderMainDiagonal(int[][] matrix) {
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > j) {
                    max = max < matrix[i][j] ? matrix[i][j] : max;
                }
            }
        }

        return max;
    }

    public static int getMaxAboveOtherDiagonal(int[][] matrix) {
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j < matrix.length - 1) {
                    max = max < matrix[i][j] ? matrix[i][j] : max;
                }
            }
        }

        return max;
    }

    public static int getMaxUnderOtherDiagonal(int[][] matrix) {
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j >= matrix.length) {
                    max = max < matrix[i][j] ? matrix[i][j] : max;
                }
            }
        }

        return max;
    }
}
