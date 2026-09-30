public class Tracing1 {
    public static void main(String[] args) {
       int x = 0;
       int y = 0;
       int sum = 0;
       double p = 0.0;
       while (x < 10) {
              y = x/2;
              while (y < x) {
                     p = (x + 10.0) / 2d;
                     sum = (sum % 2) + x - y * 2 + (int)p;
                     System.out.println(sum);
                     y = y + 2;
              }
              if (x > 5) {
                     x += 1;
              }
              else {
                     x += 2;
              }
       }
    }
}

