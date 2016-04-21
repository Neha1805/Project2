/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.*;
public class date {
    public static void main(String [] args)
    {
    int mm =07;
    int dd =31;
    int yy =2011;
    
    if(dd<31)
    {
        dd=dd+04;
        System.out.println(mm+"/"+dd+"/"+yy);
    }
    else
    {
        dd=00+04;
        System.out.println(mm+"/"+dd+"/"+yy);
    }
    
    
    }
}
