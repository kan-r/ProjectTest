package com.kan;

public class HelloWorld {

    public static final String HELLO_KAN = "Hello Kan Ranganathan!";
    public static final String WELCOME = "Welcome Kan Rangan";

    public static void main(String[] args) {
        printMsg(HELLO_KAN);
        printMsg(WELCOME);
    }

    private static void printMsg(String msg) {
        System.out.println(msg);
    }
}
