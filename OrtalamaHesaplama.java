import java.util.Scanner;
public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int gecmeNotu = 55;
        double toplam = 0;
        int sayac = 0;

        for (int i = 0; i < dersler.length; i++) {
            System.out.print(dersler[i] + " notunu girin: ");
            int not = scanner.nextInt();

            if (not >= 0 && not <= 100) {
                toplam += not;
                sayac++;
            }
        }

        double ortalama = toplam / sayac;

        if (ortalama >= gecmeNotu) {
            System.out.println("Tebrikler, geçtiniz! Ortalamanız: "+ortalama);
        } else {
            System.out.println("Maalesef kaldınız. Ortalamanız: "+ ortalama);
        }
    }
}
