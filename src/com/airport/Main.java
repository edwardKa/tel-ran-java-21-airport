package com.airport;

public class Main {

    public static void main(String[] args) {
        new Plane("RyanAir").start();
        new Plane("WizzAir").start();
        new Plane("EasyJet").start();
        new Plane("El Al").start();
        new Plane("UIA").start();
    }
}
