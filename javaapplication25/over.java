/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.*;
public class over {
    
    int add(int x,int y)
    {
        System.out.println(x+y);
        return x+y;
    }
    
    String add(String x,String y)
    {
         System.out.println(x+y);
            return x+y;
    }
    public static void main(String [] args)
    {
        over o = new over();
        o.add(1,2);
        o.add(1,2);
    }
    
}
