import java.util.Scanner;
public class consis5E{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer N: ");
    int N = sc.nextInt();
    int count = 0;
    int number = 2;
    
    boolean isPerfectnumber = true;
    
    while (count < N) {
      if (isPerfectnumber) {
        System.out.println(number);
        count++;
      }
      number++;
    }
  }
}
