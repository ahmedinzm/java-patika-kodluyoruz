import java.util.Scanner;
public class Polindrome {

    public static String checkPalindrome(int num) {
        int reversed = 0; // num'un tersini saklamak için değişken tanımla
        int original = num; // input sayısının orijinal değerini sakla

        // input sayısının her basamağını tek tek al ve tersini hesapla
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        // orijinal sayı ile ters sayıyı karşılaştır ve sonucu buna göre döndür
        if (original == reversed) {
            return "palindrom sayı";
        } else {
            return "palindrom sayı değil";
        }
    }


    public static void main(String[] args) {
       int num;
       Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı gir: ");
        num = scanner.nextInt();

        String result = checkPalindrome(num);
        System.out.println(result);

    }
}
