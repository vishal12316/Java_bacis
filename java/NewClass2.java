import java.util.Arrays;
public class NewClass2 {
  
  // arrays
  public static void main (String[] args) {
     
     //int[] arr = {1,2,3,4,5,6,7};
     
    // System.out.println(arr[5]);
     
    // for (int i=0;i<arr.length ;i++ ){
     //  System.out.println(arr[i]);
     //} 
     //System.out.println(Arrays.toString(arr));
     // for each loop
     //for (int num : arr){
      // System.out.println(num);
    // }
     
     //find the max and min element of an array 
     
     //int[] arr = {22,32,432341,232545,547345,23,44};
     
    // int max = arr[0];
     //int min = arr[0];
     
    // for (int i=0;i<arr.length;i++){
      // if (arr[i]>max){
        // max = arr[i];
         //System.out.println(max);
      // }
      // if (arr[i]<min){
      //   min = arr[i];
     //  }
     //}
     //System.out.println(max);
     //System.out.println(min);
     
     // check if The element is inside  of array or not
     
     int arr[] = {12,23,446,54,13,57,45};
     int element = 53;
     int flag = 0;
     for (int i=0;i<arr.length;i++){
       
       if (arr[i] == element){
         flag=1;
         break;
       }
     }
       if (flag == 1){
         System.out.println("found");
         
       }else{
         System.out.println("not found");
       }
       
       // sum of all the elements in array
       int arr1[] = {1,2,3,4,566,55};
       int sum = 0;
       
       for (int i = 0 ;i<arr1.length;i++){
         sum = sum + arr1[i];
       }
     System.out.println(sum);
     System.out.println(sum/arr1.length);
  }

  
}
