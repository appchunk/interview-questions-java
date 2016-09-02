/**
 * Rotate a sorted (integer)array
 * ----------------------------------------
 * input:{1,5,6,7,9,12,14,17,18}, rotate by 4 elements
 * output: {12,14,17,18,1,5,6,7,9}
 **/
import java.util.*;
import java.lang.*;
import java.io.*;

class RotateSortedArray{
  public static void rotateArray(int[]A, int k){
    if(k>A.length) k = k%A.length;
    int a = A.length -k;
    reverse(A,0,a-1);
    reverse(A,a,A.length-1);
    reverse(A,0,A.length-1);
    System.out.println(Arrays.toString(A));
  }
  //function to reverse, java function works as pass by value
  public static void reverse (int[]A, int left, int right){
    while(left<=right){
      int temp = A[left];
      A[left] = A[right];
      A[right]= temp;
      left++;
      right--;
    }
  }
  
  public static void main (String[] args) throws java.lang.Exception
  {
    int[] A  = {1,5,6,7,9,12,14,17,18};
    rotateArray(A,4);
  }  
  
}
