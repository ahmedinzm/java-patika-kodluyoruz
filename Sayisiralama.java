import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        int num1 = scanner.nextInt();

        System.out.print("2. sayıyı girin: ");
        int num2 = scanner.nextInt();

        System.out.print("3. sayıyı girin: ");
        int num3 = scanner.nextInt();

        int enKucuk = num1;

        if (num2 < enKucuk) {
            enKucuk = num2;
        }

        if (num3 < enKucuk) {
            enKucuk = num3;
        }

        int enBuyuk = num1;

        if (num2 > enBuyuk) {
            enBuyuk = num2;
        }

        if (num3 > enBuyuk) {
            enBuyuk = num3;
        }

        int ortaSayi = num1 + num2 + num3 - enKucuk - enBuyuk;

        System.out.println(enKucuk + " <= " + ortaSayi + " <= " + enBuyuk);

    }



}
