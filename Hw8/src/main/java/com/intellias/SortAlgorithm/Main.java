package com.intellias.SortAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[10000];
        for (int i = 0; i < 10000; i++) {
            people[i] = new Person(50, 50, i);
        }

    QuickSort quickSort = new QuickSort();


    Person[] result = quickSort.sort(people, Comparator.comparingInt(Person::getAge)); //same for age and height, only to change getWeight -> getAge/ageHeight


    System.out.println(Arrays.toString(result));
    }
}
