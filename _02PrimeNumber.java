package com.vyku.technical_Round_Practice;

public class _02PrimeNumber
{
    public static void main(String[] args) {
    _02PrimeNumber.checkPrime(13);
    }
    static void checkPrime(int num)
    {
        if(num<2)
        {
            System.out.println("Num is not a prime");
            System.exit(0);
        }
        int count=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0) {
                count++;
            }
        }
        if(count>1)
        {
            System.out.println("given number is not a prime");
        }
        else
        {
            System.out.println("given number is a prime");
        }
    }
}
