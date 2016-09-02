import java.util.*;
import java.lang.*;
import java.io.*;

public class IntersectionUnsortedArrays{
  
  public static int[] inrersectionArray(int[] A, int[] B){
    List<Integer> list = new ArrayList<Integer>();
    Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
    for(int i=0; i<A.length; i++){
      map.put(A[i],0);
    }
    for(int j=0; j<B.length; j++){
      if(map.containsKey(B[j]) && map.get(B[j]) ==0){
        map.put(B[j],1);
        list.add(B[j]);
      }
    }
    int[] array = new int[list.size()];
    for(int i = 0; i < list.size(); i++) array[i] = list.get(i);
    return array;
  }
  
  public static void main (String[] args) throws java.lang.Exception
  {
    int [] TestA = {25,16,8,31,20,31};
    int [] TestB = {1,2,3,5,5,31,8,31,31,31};
    System.out.println(Arrays.toString(inrersectionArray(TestA, TestB)));  
  }
}