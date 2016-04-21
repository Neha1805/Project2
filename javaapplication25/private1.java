/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.*;
/**
 *
 * @author Neha
 */
public class private1 {

     
     int disp(int [] a)
    {
        a[0]=11;
        return a[0];
        
    }
   
    
     public static void main(String [] args)
    {
        private1 p2=new private1();
        int [] arr = new int[2];
        arr[0]=1;
        arr[1]=2;
        System.out.println(arr[0]);
        p2.disp(arr);
        System.out.println(p2.disp(arr));
        System.out.println(arr[0]);
    }
    
    
}
