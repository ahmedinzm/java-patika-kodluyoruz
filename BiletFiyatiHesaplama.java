import java.util.Scanner;
public class BiletFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = input.nextInt();

        double normalTutar = mesafe * 0.10;
        double indirimOrani = 0;

        if(mesafe > 0 && yas > 0 && yolculukTipi == 1 || yolculukTipi == 2) {
            if(yas < 12) {
                indirimOrani = 0.5;
            } else if(yas >= 12 && yas <= 24) {
                indirimOrani = 0.1;
            } else if(yas >= 65) {
                indirimOrani = 0.3;
            }

            double indirimliTutar = normalTutar - (normalTutar * indirimOrani);

            if(yolculukTipi == 2) {
                indirimliTutar *= 1.6;
            }

            System.out.println("Toplam Tutar: " + indirimliTutar);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }

    }
}
