package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoopTest loopTest = new LoopTest();

        System.out.println("Program will print stars pattern. Please select version:" +
                "\n1 - column" +
                "\n2 - row" +
                "\n3 - square" +
                "\n4 - triangle v1" +
                "\n5 - triangle v2" +
                "\n6 - diagonal v1" +
                "\n7 - diagonal v2" +
                "\n8 - power matrix");

        int selectedPattern = scanner.nextInt();
        switch (selectedPattern) {
            case 1:
            {
                loopTest.PrintColumn(5);
                break;
            }
            case 2:
            {
                loopTest.PrintRow(5);
                break;
            }
            case 3:
            {
                loopTest.PrintSquare(5);
                break;
            }
            case 4:
            {
                loopTest.PrintLeftTriangle(5);
                break;
            }
            case 5:
            {
                loopTest.PrintRightTriangle(5);
                break;
            }
            case 6:
            {
                loopTest.PrintDiagonalPattern(5);
                break;
            }
            case 7:
            {
                loopTest.PrintDiagonalSecondPattern(5);
                break;
            }
            case 8:
            {
                loopTest.PrintPowers(5);
                break;
            }
            default: {
                System.out.println("You selected wrong value!");
            }
        }
    }
}
