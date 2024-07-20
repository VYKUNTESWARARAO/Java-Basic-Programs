package com.vyku.technical_Round_Practice;

public class _08FibanocciSeries
{
    public static void main(String[] args) {

            fibanoociSeries(10);

    }
    static void fibanoociSeries(int n)
    {
        int first=0;
        int second=1;

        for (int i = 1; i <= n; i++)
        {
            System.out.println(first+" ");
            int next=first+second;
            first=second;
            second=next;

        }


    }
}
