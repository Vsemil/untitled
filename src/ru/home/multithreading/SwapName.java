package ru.home.multithreading;

public class SwapName {

    private String name1 = "Ivan";
    private String name2 = "Evgeniy";

    public void swapName(Object key) {
        synchronized (key) {
            String temp = name1;
            name1 = name2;
            name2 = temp;
        }
    }

    public synchronized void swapName2() {
        String temp = name1;
        name1 = name2;
        name2 = temp;
    }
}
