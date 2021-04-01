package ru.home;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird(1, "Ля", new Egg());
        System.out.println(bird.sing());
        bird.setWeight(3);
    }
}
