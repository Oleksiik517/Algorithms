package com.intellias.SortAlgorithm;


import java.util.Comparator;

public class QuickSort {


    public Person[] sort(Person[] people, Comparator<Person> personComparator) {
        quickSort(people, personComparator, 0, people.length-1);
        return people;
    }

    private static void quickSort(Person[] people, Comparator<Person> personComparator, int begin, int end ) {
        if(begin<end) {
            int p = splitter(begin, end, people, personComparator);
            quickSort(people, personComparator, begin, p-1);
            quickSort(people, personComparator, p+1, end);
        }

    }

    private static int splitter(int startIdx, int finalIdx, Person[] people, Comparator<Person> personComparator) {
        Person pivot = people[finalIdx];

        int i = startIdx;
        for(int j = i; j < finalIdx; j++) {
            if(personComparator.compare(people[j], pivot) < 0) {
                swap(people, i, j);
                i++;
            }
        }
        swap(people, i, finalIdx);
        return i;
    }

    private static void swap(Person[] people, int i, int j) {
        Person temp = people[i];
        people[i] = people[j];
        people[j] = temp;
    }
}


