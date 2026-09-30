import java.util.Scanner;
public class recursion{
  public static int factorial (int n){
    if ( n != 0 ){
      return n*factorial (n-1);
    }
    else {
      return 1;
    }
  }
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print ("Enter a number: ");
    int num = sc.nextInt();
    int result = factorial (num);
    System.out.print (result);
  }
}