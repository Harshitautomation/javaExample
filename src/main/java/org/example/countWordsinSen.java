package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;

public class countWordsinSen {

    public static void main(String[] args) {

        String s = "Hello i love java java and i love python";
        String [] word={"java","python","linux"};
        countwords(word,s);

    }

    public static boolean countwords(String[] word, String s)
    {
        if(word.length==0)
        {
            System.out.println("no value found");
            return false;
        }
        HashSet<String> hs = new HashSet<>();
        String [] temp =s.split(" ");
        int count=0;
        for (String w:temp) {
            hs.add(w);
        }
        for(int i=0;i< word.length;i++)
        {
            if(hs.contains(word[i]))
            {
                System.out.println(word[i]);
                count++;
            }

        }

       /* for(int i=0;i<word.length;i++) //O(n)
        {
            for(int j=0;j<temp.length;j++) //O(n) O(n2)
            {
                if(word[i].equalsIgnoreCase(temp[j]))
                {
                    System.out.println(word[i]);
                    count++;
                    break;
                }
            }

        }*/
        System.out.println("repated word are: " + count);
        return true;
    }
}
