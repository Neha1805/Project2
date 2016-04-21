/*
 * to check if a String contains only numeric digits?
*/
package javaapplication25;

import java.util.Arrays;

public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = new String("neha asthana is a good girl ");
        byte b =(byte) 1232222;
        long l=b;
        int count=0;
        int len=str.length();
        System.out.println("long"+l);
        for(char ch:str.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                System.out.println("its number");
            }
            else {
                System.out.println("its not a number");
            }
            
        }
        //reversing a string
        char [] c=str.toCharArray();
        for(int i=len-1;i>=0;i--)
        {
            System.out.print(c[i]);
        }
        System.out.println("");
        Arrays.sort(c);
        System.out.println(c);
        for(int i=0;i<c.length-1;i++)
        {
            
            if(c[i]==c[i+1]){
                count++;
                
               
            }
            
        }
        System.out.println(str);
            if(count>1)
            {
            System.out.println("not unique");
            }
            else
            {
               System.out.println("its unique"); 
            }
        for(int i=0;i<c.length;i++)
        {
            
            if(Character.isWhitespace(c[i])){
                char ch='2';
                str=str.replace(c[i],ch);
            }
           
            
        }
         System.out.println(str);
        
        
    }
    
}


