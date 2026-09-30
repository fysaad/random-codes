public class Text {
  public static void main (String [] args){
  
    String text = "CSE";
    String text1 = "";
    
    for (int index = 0; index < text.length(); index++){
      int text_ascii = text.codePointAt(index);
      int ascii_l = text_ascii+32;
      char X = (char)ascii_l;
      text1 = text1 + X;
    }
    System.out.println (text1); 
    
  }
}