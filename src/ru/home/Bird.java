package ru.home;

public class Bird {
    private int age;
    private int weight;
    private String name;
    private Egg egg;

    public Bird(int age, String name, Egg egg) {
        this.age = age;
        this.name = name;
        this.egg = egg;
    }

    public Bird(int age, String name) {
        this(age, name, new Egg());
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String sing() {
        if (name == "Ля") {
            return "ля-ля";
        } else {
            return "fi";
        }
    }
}
