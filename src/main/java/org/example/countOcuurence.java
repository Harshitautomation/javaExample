package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class countOcuurence {

    public static void main(String[] args) {

        countduplicate(" a ab b21-adc*b-bq- A C");
        //op --> a4b4c2d1q1
    }

    public static void countduplicate(String s)
    {
        String res="";
        res= s.replaceAll("[^a-zA-Z]","").toLowerCase();
        System.out.println(res);
        char[] charArray =res.toCharArray();
        Arrays.sort(charArray);
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : charArray )
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        StringBuffer sb = new StringBuffer("");
        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            sb.append(entry.getKey() + "" +entry.getValue()+ " ");
        }
        System.out.println(sb);

    }
}
