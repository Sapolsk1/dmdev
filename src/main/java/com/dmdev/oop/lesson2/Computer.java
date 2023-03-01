package com.dmdev.oop.lesson2;

public class Computer {

    /**
     * Состояние объекта это поля класса
     */
    private int ssd = 500;
    private long ram;

    /**
     * Перегрузка конструкторов
     * Коструктор используется только для создания новых объектов
     * Порядок тоже влияет на перегрузку и тоже является перегрузкой
     * Возвращаемый тип отсутсвтует в конструкторах
     */
    public Computer() {
        System.out.println("Я был создан");
        Computer computer3 = new Computer(100, 100L);
        computer3.printState();
    }

    Computer(int newSsd) {
        ssd = newSsd;
        ram = 999;
    }

    /**
     * protected доступ в пакете и для наследников(наследники имеют доступ
     * к методам родителя)
     * @param ssd
     * @param ram
     */
     protected Computer(int ssd, long ram) {
        this.ssd = ssd;
        this.ram = ram;
    }
    Computer(long ram, int ssd) {
        this.ssd = ssd;
        this.ram = ram;
    }

    /**
     * Перегрузка методов
     * в перегрузку не входит возвращаемый тип
     */
    void load() {
        System.out.println("Я загрузился!");
    }
    void load(boolean open) {
        System.out.println("Я загрузился!");
        if (open) {
            System.out.println("Я открыл крышку!");
        }
    }

    // [модификаторы] returnValue name([params])
    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
        System.out.println();
    }


}
