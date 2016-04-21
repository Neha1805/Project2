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
public class DuplicateCharsInString {
    //int [] n =new int[10];
    //HashMap <Character,n> hm = new HashMap<Character,n>();
    public void find(String str){
        HashMap <Character,Integer> hm = new HashMap<Character,Integer>();
        char [] ch = str.toCharArray();
        for(Character c:ch)
        {
            if(hm.containsKey(c))
            {
            hm.put(c,hm.get(c)+1);
            }
            else
            {
                hm.put(c,1);
            }
        }
        Set<Character> st = hm.keySet();
        for(Character c:st)
        {
            if(hm.get(c)>1)
            {
                System.out.println(c+"--->"+hm.get(c));
            }
        }
    
}
    public static void main(String [] args)
    {
        DuplicateCharsInString dc = new DuplicateCharsInString();
        dc.find("Java2NoviceProgrammer");
    }
}