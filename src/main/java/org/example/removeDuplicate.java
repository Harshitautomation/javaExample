package org.example;

import java.util.Arrays;

public class removeDuplicate {

    public static void main(String[] args) {

        int [] test = new int[]{1,2,5,1,4,3,1,3,5,7,4};

        int n = removedupNumber(test);
        for (int i=0;i<n;i++)
        {
            System.out.print(test[i]);
        }
    }

    public static int removedupNumber(int[] arr)
    {

        if(arr.length==0 || arr.length==1)
        {
            return arr.length;
        }

        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[arr.length-1];
        return j;
    }

}
