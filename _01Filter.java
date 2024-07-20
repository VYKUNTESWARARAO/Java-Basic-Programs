package com.vyku.streamAPI;

import java.util.Arrays;
import java.util.List;

public class _01Filter
{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,23,35,40,50);

        //Q.get only even numbers in Arraylist
        List<Integer> evenList=list.stream().filter(i->i%2==0).toList();
        System.out.println(evenList);
    }
}
