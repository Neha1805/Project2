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
public class test2 {
    void divide(int x,int y) throws ArithmeticException {
        
        int res = x/y;
        if(res == 0)
            throw new ArithmeticException("Divide called");
        
    }
    
    public static void main(String[] args)
    {
     test2 t1 = new test2();
     test2 t2 = new test2();
     System.out.println("Enter x");
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        System.out.println("Enter y");
        Scanner s1 = new Scanner(System.in);
        int y=s1.nextInt();
        t1.divide(x,y);
        
        HashMap<Object,Object> hm = new HashMap<Object,Object>();
        HashMap<String, List<String>> inventoryManagerCountMap = new HashMap<String,List<String>>();
        hm.put(t1,t1);
        hm.put(t2,t2);
        System.out.println(t1.equals(t2));
        System.out.println(t2.hashCode());
    }
    
    
}
