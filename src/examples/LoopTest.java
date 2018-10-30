package examples;

import java.util.Scanner;

/**
 * Created by pawelk on 25/10/2018.

 Task 1:
 Print row which contains 5 stars.
 Output:
 *****

 Task 2:
 Print column which contains 5 stars.
 Output:
 *
 *
 *
 *
 *

 Task 3:
 Print square with side of square equal to 5.
 Output:
 *****
 *****
 *****
 *****
 *****

 Task 4:
 Print below triangle:
 *****
 ****
 ***
 **
 *

 Task 5:
 Print below triangle:
 *****
  ****
   ***
    **
     *

 Task 6:
 Print below pattern:
 * * *
  * *
 * * *
  * *
 * * *

 Task 7:
 Print below pattern:
  * *
 * * *
  * *
 * * *
  * *

 Task 8:
 Print below pattern:
 1 1 1 1 1
 2 4 8 16 32
 3 9 27 81 243
 4 16 64 256 1024
 5 25 125 625 3125
 */
public class LoopTest {
    private Scanner scanner;

    public LoopTest(Scanner scanner) {
        this.scanner = scanner;
    }

    public void test() {
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
                printColumn(5);
                break;
            }
            case 2:
            {
                printRow(5);
                break;
            }
            case 3:
            {
                printSquare(5);
                break;
            }
            case 4:
            {
                printLeftTriangle(5);
                break;
            }
            case 5:
            {
                printRightTriangle(5);
                break;
            }
            case 6:
            {
                printDiagonalPattern(5);
                break;
            }
            case 7:
            {
                printDiagonalSecondPattern(5);
                break;
            }
            case 8:
            {
                printPowers(5);
                break;
            }
            default: {
                System.out.println("You selected wrong value!");
            }
        }
    }

    private void printColumn(int numberOfRows) {
        printIntro(1);
        for (int i = 0; i < numberOfRows; i++) {
            System.out.println("*");
        }
        printOutro();
    }

    private void printRow(int numberOfColumns) {
        printIntro(2);
        for (int i = 0; i < numberOfColumns; i++) {
            System.out.print("*");
        }
        printOutro();
    }

    private void printSquare(int sideSquareLength) {
        printIntro(3);
        for (int i = 0; i < sideSquareLength; i++) {
            for (int j = 0; j < sideSquareLength; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        printOutro();
    }

    private void printLeftTriangle(int sideSquareLength){
        printIntro(4);
        for (int i = 0; i < sideSquareLength; i++) {
            for (int j = 0; j < sideSquareLength - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        printOutro();
    }

    private void printRightTriangle(int sideSquareLength){
        printIntro(5);
        for (int i = 0; i < sideSquareLength; i++) {
            for (int j = 0; j < sideSquareLength; j++) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        printOutro();
    }

    private void printDiagonalPattern(int sideSquareLength){
        printIntro(6);
        for (int i = 0; i < sideSquareLength; i++) {
            for (int j = 0; j < sideSquareLength; j++) {
                if ((j%2 == 0 && i%2 == 0) || (j%2 != 0 && i%2 != 0)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        printOutro();
    }

    private void printDiagonalSecondPattern(int sideSquareLength) {
        printIntro(7);
        for (int i = 0; i < sideSquareLength; i++) {
            for (int j = 0; j < sideSquareLength; j++) {
                if ((j%2 != 0 && i%2 == 0) || (j%2 == 0 && i%2 != 0)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        printOutro();
    }

    private void printPowers(int sideSquareLength) {
        printIntro(8);
        for (int i = 0; i < sideSquareLength; i++) {
            for (int j = 0; j < sideSquareLength; j++) {
                System.out.print((int)(Math.pow(i+1, j+1)) + " ");
            }
            System.out.println();
        }
        printOutro();
    }

    private void printIntro(int taskNumber) {
        System.out.println();
        System.out.println("Task " + taskNumber + ":");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
    }

    private void printOutro(){
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
    }
}
