package com.vyku.technical_Round_Practice;

public class _06Palindrome
{
    public static void main(String[] args) {
        int num=121;
        int rev=0;
        int rem;
        int temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(num==rev)
            System.out.println("is palindrome");
        else
            System.out.println("numebr is not palindrome");
    }
}
