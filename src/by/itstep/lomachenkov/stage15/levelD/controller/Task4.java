package by.itstep.lomachenkov.stage15.levelD.controller;

import by.itstep.lomachenkov.stage15.levelD.model.MatrixLogic;
import by.itstep.lomachenkov.stage15.util.Input;
import by.itstep.lomachenkov.stage15.util.MatrixGenerator;
import by.itstep.lomachenkov.stage15.util.ResultUI;
import by.itstep.lomachenkov.stage15.view.Printer;

public class Task4 {
    public static void main(String[] args) {
        Printer.print("This program checks are there zero-numbers above " +
                "the other diagonal of the matrix.\n");

        int size;

        do {
            Printer.print("Enter the size: ");
            size = Input.input();
        } while (size <= 1);

        int[][] matrix = new int[size][size];

        MatrixGenerator.initMatrixWithNegativeValues(matrix);

        boolean flag = MatrixLogic.isThereZeroNumberUnderOtherDiagonal(matrix);

        Printer.print(ResultUI.format(matrix));

        Printer.print(ResultUI.formatZero(flag));
    }
}
