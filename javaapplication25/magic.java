/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.*;

public class magic {
    void d()
    {}
    public static void main(String[]args)
    {
        try
        {
        final magic m = new magic();
        magic m1 = m;
        m.d();
        }
        catch(Exception e){
            
        }
        int[] A= new int[10];
        Random r = new Random();
        for(int i=0;i<A.length;i++)
        {
            int ri = r.nextInt(10);
            A[i]=ri;
          
        }
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==i){
                System.out.println(A[i]+"-->"+i);
    }
            else{
            
                System.out.println("none");
        
    }
        }
}
}
