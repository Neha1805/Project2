
package nehapractise;
import java.util.*;
public class MergeSort {
    public static void main(String [] args)
    {
    int [] arr = new int[50];
    int med = ((arr.length)/2);
    Random rand = new Random(); //random number generated and stored in array
    System.out.println("Unsorted Array");
    for(int i =0;i<arr.length;i++)
    {
        int randomInt = rand.nextInt(100);
        arr[i]=randomInt;
        System.out.println(arr[i]);
    }
    int [] leftarr = new int[med];
    int [] rightarr = new int[med];
    System.out.println("Left Array");
    for(int i=0;i<med;i++)
    {
        leftarr[i]=arr[i];
         System.out.println(leftarr[i]);
    }
    System.out.println("Right Array");
    for(int i=med;i<arr.length;i++)
    {
        
         rightarr[i-med]=arr[i];
         System.out.println(rightarr[i-med]);     
    }
    //sort both arrays
     System.out.println("Sorted Left Array");
    Arrays.sort(leftarr);
    for(int i = 0;i<leftarr.length;i++)
    {
        
        System.out.println(leftarr[i]);
        
    }
    System.out.println("Sorted Right Array");
    Arrays.sort(rightarr);
    for(int i = 0;i<rightarr.length;i++)
    {
        
        System.out.println(rightarr[i]);
        
    }
   // Arrays.equals(leftarr,rightarr);
    //Merge
     System.out.println("Full Sorted Array");
    merge(leftarr, leftarr.length, rightarr, rightarr.length, arr);
     for (int i : arr) {
      System.out.println(i);

    }
  
    }
    public static void merge(int[] arrA, int sizeA, int[] arrB, int sizeB, int[] arrC) {
    int arrAIndex = 0, arrBIndex = 0, arrCIndex = 0;

    while (arrAIndex < sizeA && arrBIndex < sizeB)
      if (arrA[arrAIndex] < arrB[arrBIndex])
        arrC[arrCIndex++] = arrA[arrAIndex++];
      else
        arrC[arrCIndex++] = arrB[arrBIndex++];

    while (arrAIndex < sizeA)
      arrC[arrCIndex++] = arrA[arrAIndex++];

    while (arrBIndex < sizeB)
      arrC[arrCIndex++] = arrB[arrBIndex++];
  }
}
    

