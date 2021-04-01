package ru.home.multithreading;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();

        printer.start();


        System.out.println("main поток");
        for (int i = 0; i < 5; i++) {
            System.out.println("Mein поток работает");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Конец меин потока");
    }
}
