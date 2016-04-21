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
public interface A {
    void show();
    
    int x=10;
}
interface B1 extends A{
    void show();
    void d();
}
class c_1 implements A,B1{
    public void show()
    {
      
        System.out.println("HEllo");
    }
    public void d()
    {
        
    }
    public static void main(String[] args)
    {
        c_1 cc = new c_1();
        cc.show();
    }
}

    

