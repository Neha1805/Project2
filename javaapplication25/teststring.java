/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.*;
public class teststring {
    private int x,y;
    public void disp(int x,int y)
    {
        this.x=x;
        this.y=y;
        System.out.println(x+""+y);
    }
    public static void main(String [] args)
    {
        teststring ts1 = new teststring();
        ts1.disp(2, 3);
        teststring ts11 = new teststring();
        ts11.disp(12, 13);
        List lt = new ArrayList<>();
        lt.add(1);
        lt.add("1");
        String s1 = new String("abc");
        //String s1 = "abc";
        String s2 = new String("abc");
        //String s2 = "abc";
         System.out.println(s1.equals(s2));
         System.out.println(s1==s2);
        String ts = "abcjAhNgAhGjhfhAljhRkhgRbhjbevfNhO";
        String test = "NANAGARRO";
        String op="";
        for(int i=0;i<ts.length();i++)
        {
            char c = ts.charAt(i);
            //op=op+Character.isUpperCase(c);
            if(Character.isUpperCase(c))
            {
                op=op+c;
            }
         
            
        }
           //System.out.println(op);
        if(op.equals(test))
            {
                System.out.println("Same");
            }
            else
            {
                System.out.println("Not Same");
            }
      
    }
    
}
