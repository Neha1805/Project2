/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;
import java.util.*;
import java.io.*;

class Map1{
 
    public static void main(String []argh){
           HashMap<String,Integer> hm = new HashMap<String,Integer>();
          // Map<String,Integer> hm1 = new TreeMap<String,Integer>(hm);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hm.put(name,phone);
        }
        String s = in.next();//value
        Map<String,Integer> hm1 = new TreeMap<String,Integer>(hm);
         // Get a set of the entries
        Set set = hm1.entrySet();
        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            
            // Write code here
            
            Map.Entry me = (Map.Entry)it.next();
            Object str = me.getKey();
            //System.out.println(str);
            if(s.equals(str)){
            System.out.println(me.getKey()+"="+me.getValue());
            }
            else
                {
                System.out.println("Not Found");
            }
        }
        in.close();
    }
}


