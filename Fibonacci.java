import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = input.nextInt();

        int oncekiSayi = 0;
        int sonrakiSayi = 1;

        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(oncekiSayi + " ");

            int toplam = oncekiSayi + sonrakiSayi;
            oncekiSayi = sonrakiSayi;
            sonrakiSayi = toplam;
        }
    }
}
