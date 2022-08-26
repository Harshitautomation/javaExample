package org.example;

public class reverseNumberNSum {

    public static void main(String[] args) {

        reversenum(431);
    }

    public static void reversenum(int n)
    {
        int rev =0;
        int rem=0;
        int sum=0;

        while(n>0)
        {
            rem = n%10;
            rev = rev*10 + rem;
            n =n/10;
        }
        //sum of number
        while(rev>0) {
            sum = sum+rev%10;
            rev = rev/10;
        }
        System.out.println(sum);
    }
}
