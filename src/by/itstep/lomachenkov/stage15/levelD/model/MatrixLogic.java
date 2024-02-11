package by.itstep.lomachenkov.stage15.levelD.model;
// All the methods has O(N^2)
public class MatrixLogic {
    public static boolean isThereZeroNumberAboveOtherDiagonal(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j < matrix.length - 1) {
                    if (matrix[i][j] == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean isThereZeroNumberUnderOtherDiagonal(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j >= matrix.length) {
                    if (matrix[i][j] == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
