package by.itstep.lomachenkov.stage15.util;

import java.util.Scanner;

public class Input {
    private static final Scanner SCN;

    static {
        SCN = new Scanner(System.in);
    }
    public static int inputSize() {
        return SCN.nextInt();
    }
}
