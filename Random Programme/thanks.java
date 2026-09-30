public class thanks{   
  public static void main (String [] args){        
    int num = 2;          
    for (int i = 1; i <= num; i++){       
      System.out.println ("THANKS A LOT BROTHER. Jazakallahukhair");     
    }   
    
//    int x= 5;
//    int y= 7;
//    y= ++x;
//    x= y--;
//    System.out.println(x);
//    System.out.println(y);
    
    int sum =0;
    
    int m = 10;
    int n = 5;
     sum = sum + n + (++m); //0 + 5 + 11; here m = m + 1;
     sum = sum + n + (m++); //16 + 5 + 11 + 1 ; here m = 11 use then increment 1;
    
    System.out.println(sum);
   
    
    
  } 
}