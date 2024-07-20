package com.vyku.streamAPI;

import java.util.Arrays;
import java.util.List;

public class _07forEachMethod_And_toArray
{
    public static void main(String[] args) {
      List<Integer> list= Arrays.asList(2,34,55,32,13,54);
//        list.forEach(i->{if(i%2==0){
//            System.out.println(i);
//        }});
        ///====>STREAM TO ARRAY
        //Integer[] arr=list.stream().toArray(Integer[]::new);
        Integer[] arr=list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));







    }


}