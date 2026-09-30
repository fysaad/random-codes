//special number
import java.util.Scanner;
public class HW88{
  public static void main (String [] args){
  Scanner sc = new Scanner (System.in);
  System.out.print ("Enter Start Number: ");
  int start = sc.nextInt();
  System.out.print ("Enter End Number: ");
  int end = sc.nextInt();
  
  for (int i = start; i<=end; i++){
      int temp = i;
      int sum = 0;
      while (temp>0){
          int res = temp%10;
          
          temp = temp/10;
          int mul = 1; 
          for (int j = res;j>=1;j--){
              mul *=j ;
          }
          sum = sum + mul;
      }
      if (sum == i){
          System.out.println(i);
      }
      }

    }
}