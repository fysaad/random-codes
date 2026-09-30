public class HWrty{
public boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }
    return primeCheck(number, 2);
}
public static void main (String[] args){
  primeCheck (5);
}
}