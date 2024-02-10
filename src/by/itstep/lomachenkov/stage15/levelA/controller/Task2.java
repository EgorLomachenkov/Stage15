package by.itstep.lomachenkov.stage15.levelA.controller;

import by.itstep.lomachenkov.stage15.levelA.model.MatrixLogic;
import by.itstep.lomachenkov.stage15.util.Input;
import by.itstep.lomachenkov.stage15.util.MatrixGenerator;
import by.itstep.lomachenkov.stage15.util.ResultUI;
import by.itstep.lomachenkov.stage15.view.Printer;

public class Task2 {
    public static void main(String[] args) {
        Printer.print("This program displays the max under " +
                "the main diagonal of the matrix.\n");

        int size;

        do {
            Printer.print("Enter the size: ");
            size = Input.inputSize();
        } while (size <= 1);

        int[][] matrix = new int[size][size];

        MatrixGenerator.initMatrix(matrix);

        int max = MatrixLogic.getMaxUnderMainDiagonal(matrix);

        Printer.print(ResultUI.format(matrix));

        Printer.print(ResultUI.format(max));
    }
}
