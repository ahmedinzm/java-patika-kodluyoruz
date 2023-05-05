import java.util.Scanner;

public class CiftSayiToplamlari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Bir sayı giriniz: ");
            int num = scanner.nextInt();

            if (num % 4 == 0) {
                sum += num;
            }

            if (num % 2 != 0) {
                break;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + sum);
    }
}
