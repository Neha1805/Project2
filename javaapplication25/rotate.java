/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.*;
public class rotate {
    public static void main(String[] args)
    {
        int [][] arr = new int[3][3];
        Scanner s= new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=s.nextInt();
                
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int temp=arr[0][1];
        arr[0][1]=arr[0][0];
        arr[0][2]=temp;
                        System.out.println(Arrays.deepToString(arr));

    }
    
}

