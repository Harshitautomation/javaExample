package org.example;

import io.cucumber.java.sl.In;

import java.util.HashMap;
import java.util.Map;

public class twoSumTarget {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6};
        int[] b ={3,4,5,6,7,8};
        targetfind(a,7);
        int []c= sortedsumarray(b,9);
        for (int data:c) {
            System.out.println(data);
        }

    }


    static void targetfind(int[] input, int k)
        {
            Map<Integer, Integer> pairs = new HashMap<>();
            for (int i = 0; i < input.length; i++) {

                if(pairs.containsKey(input[i]))
                    System.out.println(input[i] +", "+ pairs.get(input[i]));
                else
                    pairs.put(k-input[i], input[i]);
            }

        }

    public static int [] sortedsumarray(int[] a, int target)
    {
        int i=0,j=a.length-1;

        while(i<j)
        {
            int sum = a[i]+a[j];
            if(sum<target)
            {
                i++;
            }
            else if(sum>target)
            {j--;}
            else
            {
                return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("no solution");
    }

}
