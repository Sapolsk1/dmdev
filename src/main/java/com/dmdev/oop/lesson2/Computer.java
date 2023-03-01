package com.dmdev.oop.lesson2;

public class Computer {

    int ssd = 500;
    int ram;

    /**
     * Перегрузка конструкторов
     * Коструктор используется только для создания новых объектов
     */
    Computer() {
        System.out.println("Я был создан");
    }

    Computer(int newSsd) {
        ssd = newSsd;
        ram = 999;
    }

    Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    /**
     * Перегрузка методов
     */
    void load() {
        System.out.println("Я загрузился!");
    }

    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println();
    }
}
