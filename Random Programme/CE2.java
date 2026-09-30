import java.util.Scanner;
public class CE2{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("N: ");
    int N = sc.nextInt();
    int [] arr = new int [N];
    
    for(int i=0;i<N;i++){
      arr[i]=sc.nextInt();    
    }
    System.out.println("Enter another number: ");
    int x=sc.nextInt();
    Boolean flag = false;
    for(int i=0;i<N;i++){
      if(arr[i] == x){
        System.out.print(arr[i]+" is at index "+i); 
        flag=true; 
        break;
      }            
    }
    if(flag==false){
      System.out.print("Element not found");            
    }
  }
}
