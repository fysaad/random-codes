public class CNI {
  public static void main (String [] args){
    int a = 56;
    int b = 25;
    int c = 12;
    int temp;
    
    temp = c;
    c = b;
    b = a;
    a = c;
    
    System.out.println ( "A = " + temp);
    System.out.println ( "B = " + b);
    System.out.println ( "C = " + a);
        
  }
}

/*Value of a goes to b
Value of b goes to c
Value of c goes to a*/