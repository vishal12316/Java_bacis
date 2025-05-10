public class Main {
    public static void main(String[] args) {
      
      // find tje revese of a Number
      
      int num = 12345;
      int revese = 0;
      
      while(num!=0){
        
        int last = num%10;
        num = num/10;
        revese = revese * 10 + last;
        
       // System.out.print(revese);
        
      
      
     // System.out.print(last);
      }
      System.out.print(revese);
  }
}