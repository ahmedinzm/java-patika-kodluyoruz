import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        Random random = new Random(); // Rastgele sayı üretmek için Random sınıfı kullanılır
        int rastgeleSayi = random.nextInt(101); // 0 ile 100 arasında rastgele bir tam sayı üretilir
        int tahmin = -1; // Kullanıcının tahmin değeri, başlangıçta geçersiz bir değere atanır
        Scanner scanner = new Scanner(System.in);

        while (tahmin != rastgeleSayi) {
            System.out.print("Tahmininizi giriniz (0-100 arasında): ");
            tahmin = scanner.nextInt();

            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı deneyin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı deneyin.");
            }
        }

        System.out.println("Tebrikler! Doğru tahmin: " + rastgeleSayi);
    }
}
