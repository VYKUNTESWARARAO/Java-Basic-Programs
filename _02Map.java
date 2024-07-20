package com.vyku.streamAPI;

import java.util.Arrays;
import java.util.List;

public class _02Map
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 14, 16, 18, 20);

        //Q.double all the elements in the ArrayList
        List<Integer> doubledList = list.stream().map(i -> i * 2).toList();
        System.out.println(doubledList);

        //Q.create one Arraylist marks and show only passed students
        List<Integer> marks = Arrays.asList(20, 24, 28, 36, 45, 70, 90);
        List<Integer> passed = marks.stream().filter(i -> i > 35).toList();
        System.out.println(passed);

        //Q.Add 5 marks for the failed students
        List<Integer>addedmarks=marks.stream().filter(i->i<35).map(j->j+5).toList();
        System.out.println(addedmarks);

        //
    }

}
