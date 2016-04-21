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
public interface Animal
{
  //public void sleeps( );
}

class Dog implements Animal
{   
   public void sleeps(Animal s )
  {
    /* some code here */    
  }
}

class SomeClass 
{

  public static void main(String [ ] args)
  {
    Dog d = new Dog( ) ;   
    
   // this checks to see if d is of type Animal
    if ( d instanceof Animal) 
        System.out.println("true");
    else   
        System.out.println("false");
    
     ArrayList<Integer> l = new ArrayList<Integer>();
     List<Integer> ll = new ArrayList<Integer>();
     List<Integer> l2 = new LinkedList<Integer>();
  }
}
