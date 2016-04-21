package javaapplication25;

import java.util.*;
public class lower {
    public static void main(String [] args)
    {
        int lower_alpha=0,upper_alpha=0;
        String str = "HelloWorld42";
        String str1 =str;
        String str2 = str;
        int len = str.length();
        char [] ch = str.toCharArray();
        for(int i=0;i<len-2;i++)
        {
          str1=str1.toLowerCase();
          if(str1.charAt(i)==str.charAt(i))
              lower_alpha++;
            
        }
        for(int i=0;i<len-2;i++)
        {
          str2=str2.toUpperCase();
          if(str2.charAt(i)==str.charAt(i))
              upper_alpha++;
            
        }
        System.out.println(lower_alpha+":"+upper_alpha);
    }
    
}
