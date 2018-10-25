package com.company;

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
    public LoopTest() {

    }

    public void PrintColumn(int numberOfRows) {
        PrintIntro(1);
        for (int i = 0; i < numberOfRows; i++) {
            System.out.println("*");
        }
        PrintOutro();
    }

    public void PrintRow(int numberOfColumns) {
        PrintIntro(2);
        for (int i = 0; i < numberOfColumns; i++) {
            System.out.print("*");
        }
        PrintOutro();
    }

    public void PrintSquare(int sideSquareLength) {
        PrintIntro(3);
        for (int i = 0; i < sideSquareLength; i++) {
            for (int j = 0; j < sideSquareLength; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        PrintOutro();
    }

    public void PrintLeftTriangle(int sideSquareLength){
        PrintIntro(4);
        for (int i = 0; i < sideSquareLength; i++) {
            for (int j = 0; j < sideSquareLength - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        PrintOutro();
    }

    public void PrintRightTriangle(int sideSquareLength){
        PrintIntro(5);
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
        PrintOutro();
    }

    public void PrintDiagonalPattern(int sideSquareLength){
        PrintIntro(6);
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
        PrintOutro();
    }

    public void PrintDiagonalSecondPattern(int sideSquareLength) {
        PrintIntro(7);
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
        PrintOutro();
    }

    public void PrintPowers(int sideSquareLength) {
        PrintIntro(8);
        for (int i = 0; i < sideSquareLength; i++) {
            for (int j = 0; j < sideSquareLength; j++) {
                System.out.print((int)(Math.pow(i+1, j+1)) + " ");
            }
            System.out.println();
        }
        PrintOutro();
    }

    private void PrintIntro(int taskNumber) {
        System.out.println();
        System.out.println("Task " + taskNumber + ":");
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
    }

    private void PrintOutro(){
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
    }
}
