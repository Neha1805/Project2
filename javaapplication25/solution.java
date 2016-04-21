/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution {

     
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       solution sl=new solution();
    Scanner s = new Scanner(System.in);
    int ch = s.nextInt();
  try{
    sl.choice(ch);
  }   catch(NumberFormatException ne)
            {
            System.out.println(ne);
            }
        }
        
    
 void choice(int c)throws NumberFormatException{
        
     if(c<=0)throw new NumberFormatException("Enter valid value of choice");
    
     else if(c==1)
    {
        System.out.println("Enter cube side");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        System.out.println(a*a*a);
    }
     else if(c==2)
    {
        System.out.println("Enter rect side");
        Scanner s = new Scanner(System.in);
         int a = s.nextInt();
          int b = s.nextInt();
        System.out.println(a*b);
    }
     else
     {
         System.out.println("Enter a value");
     }
    }
    
      
      
}
        
    

