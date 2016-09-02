/**
 * Merging(union) of two sorted arrays
 * -----------------------------------
 * input: arrays of test data
 * output: sorted arrays
 **/
import java.util.*;
import java.lang.*;
import java.io.*;

class MergeSortedArrays{
  
  public static int[] mergeArrays(int[]A, int []B){
    //initialize new array for storing union of A and B
    int [] C = new int[A.length+B.length];
    int ai=0, bj=0, ck=0, d=0;
    
    while(ai<A.length && bj <B.length){
      //copy values from A and B
      if(A[ai] <B[bj]){
        C[ck++]=A[ai++];
      }else if(A[ai] >B[bj]) {
        C[ck++]=B[bj++];
      } else { //case of duplicates
        C[ck++]=A[ai++];
        bj++;
        d++;
      }
    }
    //copy rest of the items
    while(ai<A.length)
      C[ck++]=A[ai++];
    while (bj<B.length)
      C[ck++] =B[bj++];
    
    return Arrays.copyOf(C, A.length+B.length-d);
  }
  
  public static void main (String[] args) throws java.lang.Exception
  {
    int[][] Test = {{6,8,12,16,21,24,31,32,34,39,50}, {23,27,29,34,36,38,44,50},
      {10,20,30,40,50},{21,31,44,55,77}};
    for(int i=0; i<Test.length;i+=2){
      System.out.println(Arrays.toString(mergeArrays(Test[i], Test[i+1]))); 
    }
  }  
}
