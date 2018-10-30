package com.company;

import examples.LoopTest;
import examples.PromotionSimulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Basics
        /*
        Scanner scanner = new Scanner(System.in);
        LoopTest loopTest = new LoopTest(scanner);
        loopTest.test();
        */

        //Introduction to OOP
        PromotionSimulator simulator = new PromotionSimulator();
        simulator.simulate();
    }
}
