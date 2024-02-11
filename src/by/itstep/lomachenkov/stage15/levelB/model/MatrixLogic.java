package by.itstep.lomachenkov.stage15.levelB.model;
// All the methods has O(N^2)
public class MatrixLogic {
    public static int countEvenNumbersAboveMainDiagonal(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > i) {
                    count = matrix[i][j] % 2 == 0 ? ++count : count;
                }
            }
        }

        return count;
    }

    public static int countEvenNumbersUnderMainDiagonal(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > j) {
                    count = matrix[i][j] % 2 == 0 ? ++count : count;
                }
            }
        }

        return count;
    }

    public static int countEvenNumbersAboveOtherDiagonal(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j < matrix.length - 1) {
                    count = matrix[i][j] % 2 == 0 ? ++count : count;
                }
            }
        }

        return count;
    }

    public static int countEvenNumbersUnderOtherDiagonal(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j >= matrix.length) {
                    count = matrix[i][j] % 2 == 0 ? ++count : count;                }
            }
        }

        return count;
    }
}
