import java.util.Scanner;
public class DaireAlanHesaplama {
    public static void main(String[] args) {
        int cap;
        double pi = 3.14, alan,cevre;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yarı çapı giriniz: ");
        cap = scanner.nextInt();

        alan = pi * cap*cap;
        cevre = 2 * pi * cap;

        System.out.println("Daire'nin alanı: "+alan);
        System.out.println("Daire'nin çevresi: "+cevre);


    }
}
