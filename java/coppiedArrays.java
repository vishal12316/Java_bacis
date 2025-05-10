import java.util.Arrays;
public class coppiedArrays{
  public static void main (String[] args) {
    int arr1 [] = {12,23,45,56};
    int arr2 [] = new int[arr1.length];
    for (int i=0;i<arr1.length ;i++ ){
      arr2[i] = arr1[i];
      
    } 
    System.out.println("coppied array"+ Arrays.toString(arr2));
  }
}