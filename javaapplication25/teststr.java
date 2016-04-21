/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.*;
public class teststr {
    
    public static void main(String[] args)
    {
        String s1 ="abc";
        String s2=s1;
        s1 = s1+"d";
        System.out.println(s1+" "+s2+(s1.equals(s2)));
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
         System.out.println(sb1+" "+sb2+(sb1.equals(sb2)));
         String str = "Tunisian";
         CharSequence sub ="nis";
          
             if(str.contains(sub))
             {
                 System.out.println("equal");
             }
          
         else
         {
               System.out.println("Not equal");  
         }
         String v = "google";
         char[] cha = v.toCharArray();
             char c ='g';
             char[] temp=new char[cha.length];
             for(int i=0; i < cha.length; i++)
                 if(c!=cha[i])
                 {
                    temp[i]=(char) (temp[i]+cha[i]);
                     System.out.print(temp[i]);
                 }
                 
             
         
    }
}
