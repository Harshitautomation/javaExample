package org.example;

public class palindrome {

    public static void main(String[] args) {

        String res = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(res));

    }

    public static boolean isPalindrome(String s)
    {
        int i=0,j=s.length()-1;

        while(i<j)
        {
            while (i<j && !Character.isLetterOrDigit(s.charAt(i)))
                i++;
            while (i<j && !Character.isLetterOrDigit(s.charAt(j)))
                j--;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
            {
                return false;
            }
            i++;j--;
        }
        return true;
    }

}
