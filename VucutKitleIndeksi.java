import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo,boy,vit;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boyunuzu (metre cinsinden) giriniz: ");
        boy = scanner.nextDouble();

        System.out.println("Kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        vit = kilo  / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: "+ vit);


    }
}
