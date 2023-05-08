import java.util.Scanner;

public class RecursivePrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " Sayısı ASALDIR !");
        } else {
            System.out.println(number + " Sayısı ASAL değildir !");
        }
    }

    public static boolean isPrime(int number, int divisor) {
        // Taban durum: Bölen sayı, gösterilen sayıya eşit olduğunda
        if (divisor == number) {
            return true;
        }

        // Temel durum: Gösterilen sayı bölündüğünde kalan sıfır ise
        if (number % divisor == 0) {
            return false;
        }

        // İlerleme: Bölen sayısını arttırarak devam et
        return isPrime(number, divisor + 1);
    }
}
