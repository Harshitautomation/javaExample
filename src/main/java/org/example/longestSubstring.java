package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class longestSubstring {

    public static void main(String[] args) {
        System.out.println( anotherway("abcdbnae"));
        System.out.println( lengthOfSubstring("abcdbnae"));

    }

    public static int lengthOfSubstring(String s)
    {
        int[] map = new int[256];
        Arrays.fill(map,-1);
        int i=0,maxlen=0;
        for(int j=0;j<s.length();j++)
        {
            if(map[s.charAt(j)]>=i)
            {
                i=map[s.charAt(j)]+1;
            }
            map[s.charAt(j)]=j;
            maxlen= Math.max(j-i+1,maxlen);
        }
        return maxlen;
    }

    public static String anotherway(String s)
    {
        Map<Character,Integer> visited = new HashMap<>();
        String output = "";
        for(int start =0,end =0;end<s.length();end ++)
        {
            char currChar = s.charAt(end);
            if(visited.containsKey(currChar))
            {
                start = Math.max(visited.get(currChar)+1,start);
            }
            if(output.length() <end-start+1)
            {
                output=s.substring(start,end+1);
            }
            visited.put(currChar,end);
        }
        return output;
    }
}
