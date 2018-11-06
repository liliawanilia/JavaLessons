package com.company;

import models.User;

public class Main {

    public static void main(String[] args) {
        // Live demo
        User user = new User("pawel.kubiak@gmail.com", "Paweł", "Kubiak", true, true, true, true, "48505869606", "testaddress");
        User user1 = new User("emil.d@gmail.com", "Emil", "D", true, false, false, false, "48500500500", "testaddress");

        System.out.println(user.getEmail());
        System.out.println(user1.getEmail());
        System.out.println(user.getFirstName());
        System.out.println(user1.getFirstName());

        // Basics
        /*
        Scanner scanner = new Scanner(System.in);
        LoopTest loopTest = new LoopTest(scanner);
        loopTest.test();
        */
    }
}
