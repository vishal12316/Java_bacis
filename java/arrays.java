import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
      
      int [] arr = {1,2,3,4,3454,6,62,45,332,34,56};
      System.out.println(arr[7]);
      System.out.println(arr.length);
      
     // arr[6]=123456;
    //  System.out.println(arr[6]);
      for (int i=0;i<=arr.length ;i++ ){
      //System.out.println(arr[i]);
      }
      System.out.println(Arrays.toString(arr));
// for each loop 

    for (int num : arr){
      System.out.println(num);
    }
      
    }
  
}