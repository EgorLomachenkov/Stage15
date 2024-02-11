package by.itstep.lomachenkov.stage15.levelC.controller;

import by.itstep.lomachenkov.stage15.levelC.model.MatrixLogic;
import by.itstep.lomachenkov.stage15.util.Input;
import by.itstep.lomachenkov.stage15.util.MatrixGenerator;
import by.itstep.lomachenkov.stage15.util.ResultUI;
import by.itstep.lomachenkov.stage15.view.Printer;

public class Task2 {
    public static void main(String[] args) {
        Printer.print("This program checks are there positive numbers under " +
                "the main diagonal of the matrix.\n");

        int size;

        do {
            Printer.print("Enter the size: ");
            size = Input.input();
        } while (size <= 1);

        int[][] matrix = new int[size][size];

        MatrixGenerator.initMatrixWithNegativeValues(matrix);

        boolean flag = MatrixLogic.isTherePositiveNumberUnderMainDiagonal(matrix);

        Printer.print(ResultUI.format(matrix));

        Printer.print(ResultUI.formatPositive(flag));
    }
}
