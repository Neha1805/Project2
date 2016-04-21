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
public class myCalculator {
    void power(int n,int p)
    {
        if(n<0||p<0)throw new NumberFormatException("power()-n and p should be non-negative");
        else
        {
            double res=Math.pow(n, p);
            System.out.println("res"+res);
            
        }
        
    }
    public static void main(String[]args)
    {
        myCalculator my = new myCalculator();
        my.power(2, -3);
        int n=100;
        String s = Integer.toString(n);
        System.out.println(s);
        String s1 ="Neha";
        char[] ch = s1.toCharArray();
    } 
}
