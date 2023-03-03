package com.dmdev.oop.task;

public class TimeIntervalRunner {

    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval1.totalSeconds());
        timeInterval1.print();

        timeInterval.sum(timeInterval1).print();
    }

}
