public class CNH {
  public static void main (String [] args){
    int x = 56;
    int y = 25;
    int temp;
    
    temp = x;
    x = y;
    y = temp;
    
    System.out.println ( "X = " + x);
    System.out.println ( "Y = " + y);
    
  }
}