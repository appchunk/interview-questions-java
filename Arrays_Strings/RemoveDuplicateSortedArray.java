/**
 * Remove duplicates from a sorted array 
 * ----------------------------------------
 * input:{1,2,3,3,4,4,4,5,5,5}
 * output: {1,2,3,4,5}
 **/

import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveDuplicateSortedArray {
  public static int[] removeDuplicate(int[] A){
    int i=1;
    int j=0;
    if(A.length <2){
      return A;
    }
    while(i<A.length){
      if(A[j] == A[i]){
        i++;
      }else{
        j++;
        A[j]=A[i];
        i++;
      }
    }
    return Arrays.copyOf(A,j+1);
  }
  
  public static void main (String[] args) throws java.lang.Exception
  {
    int [][] Test = {{1,2,3,3,4,4,4,5,5,5}, 
      {1,1,1,2,2,3,3,5,6,7,8,9,9,10,15},
      {1,2},
      {1},
      {},
      {1,2,2,3,4,5,6},
      {1,1,1,1,1,1,1,1,1,1,1,1,1}};
    for(int[] test: Test){
      System.out.println(Arrays.toString(removeDuplicate(test))); 
    }
    
  }
}