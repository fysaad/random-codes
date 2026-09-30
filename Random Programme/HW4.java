import java.util.Scanner;
public class HW4{
  public static void main (String [] args){
    
    Scanner sc = new Scanner (System.in);
    int N = 5;
    int [] array = new int [N];
    
    for (int index = 0; index < array.length; index++){
      System.out.print ("Enter Element: ");
      array [index] = sc.nextInt();
    }
    
    System.out.print ("Enter Target Value: ");
    int target = sc.nextInt();
    int count = 0;
    int [] idx = new int [2];
    
    for (int i = 0; i < array.length; i++){
      for (int j = i+1; j < array.length; j++){
        int sum = array[i] + array[j];
        if (sum == target){
          System.out.println ("Elements need to be added: " + array[i]+" "+ array[j] );
          //System.out.println ("Index of the Elements: " + index[0] + " and " + array[j]   );
          idx [0] = i;
          idx [1] = j;
          count++;
          break;
        }
      }
      if (count == 1){
        break;
      }
      if (count == 0){
        System.out.println ("Target value not found");
      }
    }
    System.out.println ("Index of the Elements: " + idx[0] + " and " + idx[1]);
     }
}