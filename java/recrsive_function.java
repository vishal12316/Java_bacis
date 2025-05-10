public class NewClass1 {
  
  public static void main (String[] args) {
    /* code */
  
    myfun();
  System.out.println(factorial(6));
  
  }
  
  static void myfun(){
    System.out.println("my function");
   // myfun();
  
  }

  

//find factorial of a number using recrsive function

  static int factorial(int a){
    if (a == 0){
      return 1;
    }
    return a*factorial(a-1);
  }
  
  
}