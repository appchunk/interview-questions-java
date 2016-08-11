/**
 * Intersection of two sorted arrays
 * -----------------------------------
 * input: A={1,5,6,12,14} B= {5,8,14,19,21,65}
 * output: C={5,14}
 **/
import java.util.*;
import java.lang.*;
import java.io.*;

class IntersectionSortedArray{
  
  public static int[] inrersectionSortedArray(int[] A, int[] B){
    
    int [] C = new int[Math.min(A.length, B.length)];
    int i=0,j=0,k=1;
    
    while(i<A.length && j<B.length){
      //found common element
      if(A[i] == B[j]){
        if(A[i] != C[k-1]){
          C[k++] = A[i];
        }
        i++; j++;
      }
      else if(A[i]>B[j]) j++;
      else if (A[i]<B[j]) i++;
    }
    
    return Arrays.copyOfRange(C,1,k);
  }
  
  public static void main (String[] args) throws java.lang.Exception
  {
    int [] TestA = {1,5,6,12,14};
    int [] TestB = {5,8,14,19,21,65};
    System.out.println(Arrays.toString(inrersectionSortedArray(TestA, TestB)));  
  }
}