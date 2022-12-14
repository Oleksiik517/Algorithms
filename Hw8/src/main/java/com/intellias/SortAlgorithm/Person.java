package com.intellias.SortAlgorithm;

public class Person {
    private int age;
    private int height;
    private int weight;

    public Person(int age, int height, int weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }


}
