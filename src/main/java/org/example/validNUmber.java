package org.example;

public class validNUmber {

    public static void main(String[] args) {


        System.out.println(isNUmber("5test5"));
    }

    public static boolean isNUmber(String s)
    {
        int i=0,n=s.length();

        if(s.length()==0)
        {return false;}

        while(i<n && Character.isWhitespace(s.charAt(i)))
        i++;
        s=s.trim();
        if(i<n && s.charAt(i)=='+' || s.charAt(i)=='-')
            i++;
        boolean isNumeric =false;
        while(i<n && Character.isDigit(s.charAt(i)))
        {
            i++;
            isNumeric =true;
        }
        if(i<n && s.charAt(i)=='.')
        {
            i++;
            while(i<n && Character.isDigit(s.charAt(i)))
            {
                i++;
                isNumeric =true;
            }
        }
        while (i<n && Character.isWhitespace(s.charAt(i)))
            i++;
        return isNumeric && i==n;
    }
}
