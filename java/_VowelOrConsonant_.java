import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      char ch = scanner.next().toLowerCase().charAt(0);
      if ( ch =='a'  || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
        System.out.print("vowel");
        
      }else{
        System.out.printf("consonant");
      }
  }
}