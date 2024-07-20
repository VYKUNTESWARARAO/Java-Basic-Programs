package com.vyku.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _05Comparator
{
    public static void main(String[] args)
    {
        List<String> list= Arrays.asList("A","AA","BB","AAA","BBBBB");
        Comparator<String> c=(a,b)->
        {
            int l1=a.length();
            int l2=b.length();
            return Integer.compare(l2,l1);
        };

        List<String> sortedList=list.stream().sorted(c).toList();
        System.out.println(sortedList);

    }
}
