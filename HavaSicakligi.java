import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        int secim;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen sıcaklık aralığı seçiniz:");
        System.out.println("1. 5'den küçük");
        System.out.println("2. 5 ile 15 arası");
        System.out.println("3. 15 ile 25 arası");
        System.out.println("4. 25'ten büyük");

        System.out.print("Seçiminiz (1-4): ");
         secim = scanner.nextInt();

        if (secim == 1) {
            System.out.println("Kayak yapmayı öneririm.");
        } else if (secim == 2) {
            System.out.println("Sinema etkinliğini öneririm.");
        } else if (secim == 3) {
            System.out.println("Piknik etkinliğini öneririm.");
        } else if (secim == 4) {
            System.out.println("Yüzme etkinliğini öneririm.");
        } else {
            System.out.println("Geçersiz seçim yaptınız.");
        }

    }
}
