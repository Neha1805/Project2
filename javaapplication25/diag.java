/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author Neha
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class diag {

    public static void main(String[] args) {
        int sum1=0,sum2=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i==a_j)
                    {
                    sum1=sum1+a[a_i][a_j];
                   
                }
                
            }
        }
         System.out.println(sum1);
        for(int a_i=n-1; a_i <=0; a_i--){
            for(int a_j=a_i; a_j <a_i; a_j--){
                 System.out.println("neha"+a_i+" "+a_j);
                //a[a_i][a_j] = in.nextInt();
                if(a_i==a_j || a_i!=a_j)
                    {
                    sum2=sum2+a[a_i][a_j];
                     System.out.println(a);
                }
                
                
            }
        }
         System.out.println(sum2);
        int diff=sum1-sum2;
        System.out.println("Diff is:"+diff);
    }
}
    

