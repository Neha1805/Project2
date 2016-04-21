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
public interface Flyable {
    public void fly();
}

class Duck {
Flyable fly;

 public Duck(){
  fly=new BackwardFlying();
 }

}
class BackwardFlying implements Flyable{
  public void fly(){
     System.out.println("Flies backward ");
 }
}
 class FastFlying implements Flyable{
  public void fly(){
     System.out.println("Flies 100 miles/sec");
 }
}
