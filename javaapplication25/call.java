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
public class call{
    void disp()
    {
        System.out.println("Hello its R");
    }
}
class M extends call{
    void disp()
    {
        System.out.println("Hello its M");
    }
}
class D extends M{
    void disp()
    {
        System.out.println("Hello its D");
    }
    
}


class R {
    public static void main(String [] args)
    {
        call r = new call();
        M m = new M();
        D d = new D();
        Random rn = new Random();
        for (int idx = 1; idx <= 1; ++idx){
         int randomInt = rn.nextInt(2);
         if(randomInt==1)
         {
             Random rn1 = new Random();
            for (int id = 1; id <= 1; ++id){
            int ri = rn1.nextInt(2);
            {
                if(ri==1)
                {
                    d.disp();
                }
                else
                {
                    System.out.println(randomInt);
                    m.disp();
                }
            }
             
         }
         }
         else
         {
             System.out.println(randomInt);
             r.disp();
         }
    }
}
}