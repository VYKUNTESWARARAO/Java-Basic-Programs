package com.vyku.streamAPI;

import java.util.Arrays;
import java.util.List;

public class _03Count
{
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(20, 24, 28, 36, 45, 70, 90);
        long failed=  marks.stream().filter(i->i<35).count();
        System.out.println(failed+" failed students in the class");
    }
}
