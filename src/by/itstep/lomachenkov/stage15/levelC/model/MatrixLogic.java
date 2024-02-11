package by.itstep.lomachenkov.stage15.levelC.model;
// All the methods has O(N^2)

public class MatrixLogic {
    public static boolean isTherePositiveNumberAboveMainDiagonal(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > i) {
                    if (matrix[i][j] > 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean isTherePositiveNumberUnderMainDiagonal(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > j) {
                    if (matrix[i][j] > 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
