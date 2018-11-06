package com.company;

import models.Promotion;
import models.User;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Live demo
        User user = new User("pawel.kubiak@gmail.com", "Paweł", "Kubiak", true, true, true, true, "48505869606", "testaddress");
        User user1 = new User("emil.d@gmail.com", "Emil", "D", true, false, false, false, "48500500500", "testaddress");

        System.out.println(user.toString());
        System.out.println(user1.toString());

        System.out.println();
        System.out.println("Print Promotion");
        Date startDate = new Date(118, 10, 30);
        User[] database = new User[2];
        database[0] = user;
        database[1] = user1;
        Promotion promotion = new Promotion(startDate, database, "Test promotion", "Lorem ipsum...");
        System.out.println(promotion.toString());

        // Basics
        /*
        Scanner scanner = new Scanner(System.in);
        LoopTest loopTest = new LoopTest(scanner);
        loopTest.test();
        */
    }
}
