/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.io.IOException;
import java.util.*;
public class exc {
    public void print(){
        System.out.print("A");
    }
}
class B extends exc
{
   
    @Override
    public void print(){
        super.print();
        System.out.print("B");
    }
    public static void main(String [] args)
    {
        B ob = new B();
        ob.print();
        //B obj2 = (B)new exc();
        //obj2.print();
        exc obj3 = new B();
        obj3.print();
        try
        {
            System.out.println("try");
            throw new Exception("oops");
        }
        catch(Exception e)
        {
            System.out.println("caught");
            return;
        }
        finally
        {
            System.out.println("done");
        }
    }
}
