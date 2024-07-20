package com.vyku.technical_Round_Practice;

public class _09Factorial
{
    static void factorial(int num)
    {
        int init=1;

        for(int i=num;i>0;i--)
        {
            init=init*i;
        }
        System.out.println(init);
    }

    public static void main(String[] args) {
        factorial(5);
    }
}
