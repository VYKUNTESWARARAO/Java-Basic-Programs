package com.vyku.streamAPI;

import java.util.Arrays;
import java.util.List;

public class _08Arrays_to_Stream
{
    public static void main(String[] args) {
        Integer[] arr={10,15,20,25,30};
       Arrays.stream(arr).filter(i->i%2==0).forEach(System.out::println);
    }
}
