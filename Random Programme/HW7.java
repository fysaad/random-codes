import java.util.Scanner;
public class HW7{
  public static void main (String [] args){
  Scanner sc = new Scanner (System.in);
  System.out.print ("Enter Start Number: ");
  int start = sc.nextInt();
  System.out.print ("Enter End Number: ");
  int end = sc.nextInt();
  System.out.print ("Enter a number for checking: ");
  int check = sc.nextInt();
  
  for (int i = start; i<=end; i++){
    int output = 1;
    int temp = i;
    while (temp != 0){
      int digits = temp%10;
      output *= digits;
      temp /=10;
    }
    if (output %check == 0){
      System.out.print ( output + " ");
    }
  }
  }
}
    