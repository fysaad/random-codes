import java.util.Scanner;
public class ZuckermanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a starting range");
        int start = sc.nextInt();
        System.out.println("Enter a ending range");
        int end = sc.nextInt();
        System.out.print("Zuckerman Number: ");
        for (int num = start; num <= end; num ++) {

            int temp = num;
            int mul = 1;
            
            while (temp != 0) {
                int digit = temp % 10;
                mul *= digit;
                temp = temp / 10;
            }
            if (mul == 0) {
                continue;
            }
            if (num % mul == 0) {
                System.out.print(num + " ");
            }

        }
        
        
    }
}