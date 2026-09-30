public class StrTer {
  public static void main (String [] args){
  
    String text = "CSE";
    String text1 = "";
    
    for (index = 0; index < text.lenth(); index++){
      int text_ascii = text.Code.PointAt(index);
      int ascii_l = text_ascii+32;
      char X = (char)ascii_l;
      String text1 = X + text1;
    }
    System.out.print (text1);  
  }
}