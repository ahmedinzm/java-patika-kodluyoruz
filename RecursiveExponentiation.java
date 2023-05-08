import java.util.Scanner;

public class RecursiveExponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Değeri Giriniz: ");
        int base = input.nextInt();

        System.out.print("Üs Değerini Giriniz: ");
        int exponent = input.nextInt();

        int result = recursiveExponentiation(base, exponent);
        System.out.println("Sonuç: " + result);
    }

    public static int recursiveExponentiation(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * recursiveExponentiation(base, exponent - 1);
        }
    }
}
