/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.*;
public class decimal {
   public static void main(String[] args) 
   {
       int num = 100;
       int [] arr = new int[8];
       for(int i=0;i<arr.length;i++)
       {
           int rem = num%2;
           int q = num/2;
           //System.out.println(rem);
           arr[i]=arr[i]+rem;
           num=q;
       }
       for(int i=arr.length-1;i>0;i--)
       {
           System.out.print(arr[i]);
       }
       
       
   }
}
