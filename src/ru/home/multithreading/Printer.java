package ru.home.multithreading;

public class Printer extends Thread{

    @Override
    public void run() {
        System.out.println("Начало нового потока");
        for (int i = 0; i < 5; i++) {
            System.out.println("Новый поток работает");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Конец нового потока");
    }
}
