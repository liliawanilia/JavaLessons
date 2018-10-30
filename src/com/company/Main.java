package com.company;

import LIVE.models.User;
import examples.LoopTest;
import examples.PromotionSimulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User("pawel.kubiak@gmail.com", "Paweł", "Kubiak", true, true, true, true, "48505869606", "testaddress");
        User user1 = new User("emil.d@gmail.com", "Emil", "D", true, false, false, false, "48500500500", "testaddress");

        System.out.println(user.getEmail());
        System.out.println(user1.getEmail());
        user.setEmail("pawel.kubiak2@gmail.com");
        System.out.println(user.getEmail());

        int[] arr = new int[2];
        User[] arr2 = new User[2];
        arr2[0] = user;
        arr2[1] = user1;
        // Basics
        /*
        Scanner scanner = new Scanner(System.in);
        LoopTest loopTest = new LoopTest(scanner);
        loopTest.test();
        */

        /*
        //Introduction to OOP
        PromotionSimulator simulator = new PromotionSimulator();
        simulator.simulate();
        */
    }
}
