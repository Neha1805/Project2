/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

public class inherit {
    
    inherit()
    {
        System.out.println("Base class const");
    }
    int add(int x,int y)
    {
         System.out.println("inherit"+(x+y));
        return x+y;
    }
    static String str ="neha";
    
}
class base extends inherit{
    //tatic String str ="hhh";x`
    
//}
//class base extends inherit{
    //static String str ="hhh";
    
    public static Void main(String [] args)
    {
        base b1 = new base();
        inherit in = new base();
        base b2 = (base) new inherit();
        
        String s2 = "I am unique!";
         String s5 = "I am unique!";

         System.out.println();
         final String s1="job";
         final String s21="seeker";
       String s3=s1.concat(s21);
       String s4="jobseeker";
       System.out.println(s3==s4); // Output
        
        //base b2 = new base();
         //inherit in= new inherit();
        //System.out.println(in.add(1,2));
       
         
        //System.out.println(b2.add(1,2,3));
        
    }
}
