package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countWords {

    public static void main(String[] args) {

        anotherway8("Hi I am Harshit  and  you and you are harshit");

    }

    public static void countWords(String s)
    {
        s=s.toLowerCase().replaceAll("\\s+"," ");
        System.out.println(s);
        String [] words = s.split(" ");
        Map<String,Integer> map = new LinkedHashMap<>();

        List<String> listofWords=Arrays.asList(words);
        HashSet<String> unique = new HashSet<>(listofWords);
        for (String word:unique) {
            if(Collections.frequency(listofWords,word)>1)
            {
                System.out.println("repeat word is" + word);
            }
        }

        for (String word:words)
        {
            if(map.containsKey(word))
            {
                map.put(word,map.get(word)+1);
            }
            else
            {
                map.put(word,1);
            }
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue()>1)
            {
                System.out.println("the repated are :" +entry.getKey() + " and repeated times:" +entry.getValue());
            }
        }

    }

    public static void anotherway8(String s)
    {
        s=s.toLowerCase().replaceAll("\\s+"," ");
        System.out.println(s);
        String [] words = s.split(" ");
        Map<String,Integer> map = new LinkedHashMap<>();

        List<String> listofWords=Arrays.asList(words);

      Map<String,Integer>count=  listofWords.stream().collect(Collectors.toConcurrentMap(w->w,w->1,Integer::sum));
        System.out.println(count);

    }
}
