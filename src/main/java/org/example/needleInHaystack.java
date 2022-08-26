package org.example;

public class needleInHaystack {

    public static void main(String[] args) {

        System.out.println(strstr("racecar","car"));

    }

    public static int strstr(String haystack, String needle)
    {
        if(haystack == null || needle ==null || needle.isEmpty())
        {  return -1;}
        if(haystack.equalsIgnoreCase(needle))
        {return 0;}
        int needlength = needle.length();

        for(int i=0;i<haystack.length()-1;i++)
        {
            if(haystack.substring(i,i+needlength).equalsIgnoreCase(needle))
            {return i;}
        }
        return -1;
    }
}
