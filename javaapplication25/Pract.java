package javaapplication25;

public interface Pract{
    public void drw();
}
abstract class s{
   public abstract void shape1();
   public void shape()
   {
          System.out.println("abstract neha");
   }
}
   

class c1 extends s implements Pract{
    @Override
    public void drw()
    {
        System.out.println("neha");
    }
    @Override
    public void shape1()
    {
        System.out.println("non abstract neha");
    }
    public static void main(String[] args){
        c1 c = new c1();
        
        c.drw();
     
        c.shape();
        c.shape1();
    }
}
