package com.dmdev.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.printState();

        Computer computer2 = new Computer(1050);
        computer2.printState();

        Computer computer5 = new Computer(1050, 10000L);
        computer5.printState();

        Computer computer4 = new Computer(1050L, 10000);
        computer4.printState();
        computer4.load(true);


    }

}
