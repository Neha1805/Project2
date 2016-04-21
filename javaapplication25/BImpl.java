/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;


public class BImpl{
    int x;
    protected int y;
    
}
class A1{
    public void someMethod()
	{
            BImpl b = new BImpl();
            b.x=10;
            b.y=20;
        }
}
class c extends BImpl{
    
    public void someOtherMethod()
	{
            y=100;
        }
    
}
