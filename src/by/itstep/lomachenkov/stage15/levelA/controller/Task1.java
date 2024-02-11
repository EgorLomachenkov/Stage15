package by.itstep.lomachenkov.stage15.levelA.controller;

import by.itstep.lomachenkov.stage15.levelA.model.MatrixLogic;
import by.itstep.lomachenkov.stage15.util.Input;
import by.itstep.lomachenkov.stage15.util.MatrixGenerator;
import by.itstep.lomachenkov.stage15.util.ResultUI;
import by.itstep.lomachenkov.stage15.view.Printer;


public class Task1 {
    public static void main(String[] args) {
        Printer.print("This program displays the max above " +
                "the main diagonal of the matrix.\n");

        int size;

        do {
            Printer.print("Enter the size: ");
            size = Input.input();
        } while (size <= 1);

        int[][] matrix = new int[size][size];

        MatrixGenerator.initMatrix(matrix);

        int max = MatrixLogic.getMaxAboveMainDiagonal(matrix);

        Printer.print(ResultUI.format(matrix));

        Printer.print(ResultUI.formatMax(max));
    }
}
