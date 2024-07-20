package com.vyku.technical_Round_Practice;

public class _05ReverseNumber
{
    public static void main(String[] args) {
        int num=12345;
        int reverseNum=0;
        int rem;
        while(num!=0)
        {
            rem =num%10;
            reverseNum=reverseNum*10+ rem;
            num=num/10;
        }
        System.out.println(reverseNum);
    }
}
