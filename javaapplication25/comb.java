/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.*;
import java.lang.*;
public class comb {
   public static void main(String[] args)
   {
       int [] arr = new int[]{1,2,3,5,6,7,11,12,14,20};
       int sum =0;
       for(int i=0;i<arr.length-1;i++)
       {
           if(((sum=arr[i]+arr[i+1])==5)||(sum=arr[i])==5)
           //System.out.println(sum);
         
           {
               if((sum=arr[i]+arr[i+1])==5)
               {
               System.out.println(arr[i]+"-"+arr[i+1]);
               }
               else
               {
                   System.out.println(arr[i]);
               }
       }
           else
           {
               System.out.println("no");
           }
   }
       String str = "ABCD";
       char [] temp= new char[str.length()+1];
       for(int i =0;i<str.length()-1;i++)
       {
           char [] ch = str.toCharArray();
        
           Character c = str.charAt(i);
          Character c1 = str.charAt(i+1);
          int res;
          res= c.compareTo(c1);
           //System.out.println(res);
           if(res<0)
           {
               temp[i]=str.charAt(i);
               temp[i+1]=(char) (temp[i]+str.charAt(i));
               
           }
           else
           {
               System.out.println("nono");
           }
          
       }
       for(int i =0;i<str.length()-1;i++)
       {
        System.out.println(temp[i]);
       }
}
}
