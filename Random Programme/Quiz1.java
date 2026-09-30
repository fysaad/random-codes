import java.util.Scanner;
public class Quiz1{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print ("Enter the number of guests: ");
    int num_guest = sc.nextInt();
    
    if (num_guest/4 != 0){
      int r1 = ((num_guest/4)*10) + (num_guest*2);
      System.out.println ("Renting Cost: " + r1 );
    }
    else {
      int r2 = ((num_guest/4)*10) + (num_guest*2);
      System.out.println ("Renting Cost: " + r2 );
    }
  }
} 