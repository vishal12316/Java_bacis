//import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
      
      //check if the given number is the array or not
      int arr[] = {1,2,3,4,5,6,7,8,9};
      int ele = 8;
      int flag = 0;
      
      for (int j=0;j<=arr.length ;j++ ){
        
       // System.out.println(arr[i]);
       if (arr[j]==ele){
         flag = 1;
         break;
         
         //System.out.println("found");
         
       }
       
      } 
      if (flag==1){
        System.out.println(ele);
      }else{
        System.out.println("not found");
      }
        

    }
  
}