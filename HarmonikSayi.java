import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısını girin: ");
        double sayi= scanner.nextDouble();
        double sonuc =0;
        for (double i =1; i<=sayi; i++){
            sonuc += (1/i);
        }
        System.out.print(sonuc);
    }
}
