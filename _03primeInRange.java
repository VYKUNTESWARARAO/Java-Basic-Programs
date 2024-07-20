package com.vyku.technical_Round_Practice;

public class _03primeInRange
{
    public static void main(String[] args) {
        int lower=1;int upper=20;
        for (int i = lower; i <=upper ; i++)
        {
            if(checkprime(i))
            {
                System.out.print(i+" ");
            }

        }
    }
    static boolean checkprime(int num)
    {

        if(num<2)
            return false;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                return false;

        }
        return true;
    }
}
