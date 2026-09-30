import java.util.Scanner;
public class task5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N =sc.nextInt();
    int count = 0;
    for (int i = 2; count < N; i++){
      int sum = 0;
      for(int j = 1; j < i; j++){
        if(i % j == 0){
          
          sum += j;                    
        }
      }
      if (sum == i){
        System.out.println(i);
        count++;
      }
    }
  }
}