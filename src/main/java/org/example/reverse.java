package org.example;

public class reverse {

    public static void main(String[] args) {
        System.out.println(reverseSen("i love you"));
        System.out.println(reveseSenwithSpace("i love you"));
    }

    public static String reverseSen(String s)
    {
        String rev = "";
        String a[]= s.split(" ");
        for(int i=a.length-1;i>=0;i--)
        {
            rev = rev +a[i]+ " ";
        }
        return rev.trim();
    }

    public static StringBuilder reveseSenwithSpace(String s)
    {
        String stary[] = s.split(" ");
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                sb.insert(i," ");
            }
        }
        sb.append("");
        return sb;
    }

}
// i love you
//u ouev oli