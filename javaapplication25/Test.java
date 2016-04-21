/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.*;
import java.util.Scanner;

public class Test {

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                M.power(n,p);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            finally{
                System.out.println("done");
                break;
            }
        }

    }
    void power(int n,int p) throws NumberFormatException

    {
        if(n<0||p<0)throw new NumberFormatException("power()-n and p should be non-negative");
        else
        {
            double res=Math.pow(n, p);
            System.out.println("res"+res);
            
        }
        
    }
}


