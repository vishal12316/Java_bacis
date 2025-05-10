public class Main {
    public static void main(String[] args) {
      //function
      //name of a fumction
      //block of a function
      //parameter/arguments
      //return
      sum(10);
      sum(80);
      sum(190);
      sum(1340);
      pyramid(2);
      System.out.print(multiple(10,20));
     // System.out.print(myfunc());
     int  result = 100 +myfunc();
     System.out.print(result);
    }
    
    //parameter no returntype
    static void sum(int a){
      System.out.println(a+20);
      
    }
    
    static void pyramid( int a){
      
      for ( int i=1;i<=a;i++){
        for(int j=1;j<=a-i;j++){
          System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
          System.out.print("*");
        }
        System.out.println();
      }
      
    }
    static int myfunc(){
      return 1;
    }
    static int multiple(int a, int b){
      return a*b;
    }
    

}