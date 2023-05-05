import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2,sonuc,secim;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. sayıyı gir: ");
        sayi1 = scanner.nextInt();

        System.out.println("2. sayıyı gir: ");
        sayi2 = scanner.nextInt();

        System.out.println("Seçim yapınız:\n 1- toplama\n 2-çıkarma\n 3-çarpma\n 4-bölme");
        secim = scanner.nextInt();

        switch (secim){
            case 1:
                sonuc = sayi1+sayi2;
                System.out.println("Toplama işleminin sonucu: "+sonuc);
                break;
            case 2:
                sonuc = sayi1-sayi2;
                System.out.println("Çıkarma işleminin sonucu: "+sonuc);
                break;
            case 3:
            sonuc = sayi1*sayi2;
            System.out.println("Çarpma işleminin sonucu: "+sonuc);
            break;

            case 4:
                sonuc = sayi1/sayi2;
                System.out.println("Bölme işleminin sonucu: "+sonuc);
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız");
                break;
        }




    }
}
