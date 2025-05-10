import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6};
      int sum = 0;
      int min = arr[0];
      for (int i=0;i>arr.length ;i++ ){
        if (arr[i]<min){
          min = arr[i];
          
        } 
      //for (int num : arr ) {
        //sum += num;
        //System.out.println("sum = "+sum);
        //System.out.println(arr[i]);
      } 
      System.out.println("min = "+min);
      
  } 
}