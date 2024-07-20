package com.vyku.technical_Round_Practice;

public class _07ArmStrongNum
{
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++)
        {
           if (IsArmStrong(i)) {
               System.out.println(i);
           }

        }
    }
    static boolean IsArmStrong(int num)
    {
        int temp;int nod=0;
        int sum=0;int rem;
        temp=num;
        while(temp!=0)
        {
            temp/=10;
            ++nod;
        }
       temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            sum += (int)Math.pow(rem,nod);
            temp/=10;
        }
        return sum==num;
    }
}
