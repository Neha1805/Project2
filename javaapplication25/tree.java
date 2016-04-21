/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.*;

public class tree {
    
    public static void main(String [] args)
    {
        int [] c_arr = new int[]{15,19,17,16,80,20};
        int [] p_arr = new int[]{20,80,20,80,50,50};
        int [] is_l = new int[10];
        int isl = 0; //0 is true
        
        for(int i=0;i<c_arr.length;i++)
        {
            if(c_arr[i]<p_arr[i])
            {
                isl = 0;
                is_l[i]=isl;
            }
            else
            {
                isl = 1;
                is_l[i]=isl;
            }
        }
        for(int i = 0;i<c_arr.length;i++)
        {
            System.out.print(is_l[i]+" ");
            System.out.println(c_arr[i]+"<"+p_arr[i]);
        }
        //disp
        for(int i = 0;i<c_arr.length;i++)
        {
            if(is_l[i]==0)
            {
                System.out.println(p_arr[i]);
                System.out.println("/");
                System.out.println(c_arr[i]);
            }
            else
            {
                System.out.println(p_arr[i]);
                System.out.println("\\");
                System.out.println(c_arr[i]);
            }
        }
        
        
        
    }
    
}
