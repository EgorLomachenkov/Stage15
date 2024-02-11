package by.itstep.lomachenkov.stage15.additionaltask.model;



public class SaddlePointsLogic {
    public static int getSaddlePointsAmount(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (isThePointSaddle(matrix, i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isThePointSaddle(int[][] matrix, int raw) {
        int suspectPoint = Integer.MAX_VALUE;
        int column = 0;

        for (int i = 0; i < matrix[raw].length; i++) {
            if (matrix[raw][i] < suspectPoint) {
                suspectPoint = matrix[raw][i];
                column = i;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (suspectPoint < matrix[i][column]) {
                return false;
            }
        }

        return true;
    }
}
