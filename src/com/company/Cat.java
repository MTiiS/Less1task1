package com.company;

public class Cat {

    private String name;
    private String color;
    private int age;
    private double weight;


    public Cat() {
        super();
    }

    public Cat(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void voice() {
        System.out.println("Meow");
    }


    public void play() {
        System.out.println(name + " play with you");
    }


    public void eat() {
        System.out.println(name + " not hungry anymore");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }


}
