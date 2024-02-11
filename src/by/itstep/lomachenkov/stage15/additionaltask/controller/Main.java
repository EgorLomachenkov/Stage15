package by.itstep.lomachenkov.stage15.additionaltask.controller;

import by.itstep.lomachenkov.stage15.additionaltask.model.SaddlePointsLogic;
import by.itstep.lomachenkov.stage15.util.Input;
import by.itstep.lomachenkov.stage15.util.MatrixGenerator;
import by.itstep.lomachenkov.stage15.util.ResultUI;
import by.itstep.lomachenkov.stage15.view.Printer;

public class Main {
    public static void main(String[] args) {
        Printer.print("This program displays the amount of saddle points.\n");

        int rows;
        int columns;

        do {
            Printer.print("Enter the size of matrix(rows, columns): ");
            rows = Input.input();
            columns = Input.input();
        } while (rows <= 0 && columns <= 0);

        int[][] matrix = new int[rows][columns];

        Printer.print("Enter the values: ");

        MatrixGenerator.initMatrixByUser(matrix);

        int count = SaddlePointsLogic.getSaddlePointsAmount(matrix);

        Printer.print(ResultUI.format(matrix));

        Printer.print(ResultUI.formatSaddle(count));
    }
}
