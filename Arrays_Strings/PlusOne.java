/**
 * Plus one to existing array
 * -----------------------------------
 * input:A={9,9,8}, B= {9,9,9}
 * output:Aout={9,9,9} Bout={1,0,0,0}
 **/
import java.util.*;
import java.lang.*;
import java.io.*;

class PlusOne{
  
  public static int[] plusOne(int[]A){
    int[] result = new int[A.length+1];
    int carry=0,sum;
    int j=A.length-1;
    while(j>=0){
      if(j==A.length-1) sum = A[j]+1;
      else sum = A[j]+ carry;
      result[j+1]=sum%10;
      carry= sum/10;
      j--;
    }
    result[0]= carry;
    return (carry ==0)?
      Arrays.copyOfRange(result,1, A.length+1): 
      Arrays.copyOfRange(result,0, A.length+1);
      
  }
  public static void main (String[] args) throws java.lang.Exception
  {
    int A[] ={9,9,8};
    int B[] ={9,9,9};
    System.out.println(Arrays.toString(plusOne(A)));
    System.out.println(Arrays.toString(plusOne(B)));
  }
}

