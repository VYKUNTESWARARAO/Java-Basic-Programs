package com.vyku.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _04Sorted
{
    public static void main(String[] args) {
       List<Integer> marks= Arrays.asList(18,72,36,81,16,24,23);
        //Q.sort the marks in the ArrayList========>Default Sorting
        List<Integer> sortedList=marks.stream().sorted().toList();
        System.out.println(sortedList);

        //Q.sort the elements in descending order using Comparator
       // List<Integer> customSorted= marks.stream().sorted((a, b) -> (a<b) ? 1 : (a>b) ? -1: 0).toList();
        //List<Integer> customSorted1= marks.stream().sorted((a, b) -> b.compareTo(a)).toList();
        List<Integer> customSorted2= marks.stream().sorted(Comparator.reverseOrder()).toList();
    }

}
