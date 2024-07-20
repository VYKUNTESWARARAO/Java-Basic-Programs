package com.vyku.technical_Round_Practice;

public class _04SumOfDigits
{
    public static void main(String[] args) {
        int sum=0;
        int num=12345;
        while(num!=0)
        {
            sum+=num%10;
            num=num/10;
        }
        System.out.println("sum == "+ sum);
    }
}
