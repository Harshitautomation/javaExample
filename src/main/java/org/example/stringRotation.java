package org.example;

public class stringRotation {

    public static void main(String[] args) {

       System.out.println(isRotation("CDEAB","ABCDE"));
      //  printRotation("ABCDE");

    }

    public static boolean isRotation(String s1, String s2)
    {
        if(s1.length() != s2.length())
            return false;
        //CDEABCDEAB
        String temp = s1.concat(s1);
        if(temp.contains(s2))
        {
            return true;
        }
        return false;
    }

    public static void printRotation(String s)
    {
        StringBuffer sb = new StringBuffer(s);

        sb.append(s);
        //ABCDEABCDE

        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j!=s.length();j++)
            {
                System.out.print(sb.charAt(i+j));
                System.out.println();
            }
        }
    }
}
