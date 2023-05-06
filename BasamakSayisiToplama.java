import java.util.Scanner;
public class BasamakSayisiToplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        int basamakSayisi = 0;
        int geciciSayi = sayi;

        while (geciciSayi != 0) {
            geciciSayi /= 10;
            basamakSayisi++;
        }

        int toplam = 0;
        geciciSayi = sayi;
        while (geciciSayi != 0) {
            int basamak = geciciSayi % 10;
            System.out.print(basamak + " ");
            toplam += basamak;
            geciciSayi /= 10;
        }

        System.out.println("\n" + sayi + " sayısının " + basamakSayisi + " basamağı vardır.");
        System.out.println("Basamakları toplamı: " + toplam);
    }
}
