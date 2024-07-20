package com.vyku.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _06minAndmax
{
    public static void main(String[] args) {
        List<String> list= Arrays.asList("AAAA", "ABA", "A","BBB", "AA");
        Comparator<String> c=(a,b)->
        {
            int l1=a.length();
            int l2=b.length();
            return Integer.compare(l1,l2);
        };
        String maxValue= list.stream().max(c).get();
        String minValue= list.stream().min(c).get();
        System.out.println(minValue);
        System.out.println(maxValue);



    }
}
