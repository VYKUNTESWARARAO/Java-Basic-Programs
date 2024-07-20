package com.vyku.technical_Round_Practice;

import java.util.HashMap;

public class ArmStrongNumber
{
        public static void main(String[] args) {
            String str = "example";
            HashMap<Character, Integer> frequencyMap = new HashMap<>();

            for (char c : str.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

            for (HashMap.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }


