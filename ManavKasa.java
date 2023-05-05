import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meyveler = {"Armut", "Elma", "Domates", "Muz", "Patlıcan"};
        double[] fiyatlar = {2.14, 3.67, 1.11, 0.95, 5.00};
        double[] kilolar = new double[5];
        double toplamTutar = 0;

        for (int i = 0; i < meyveler.length; i++) {
            System.out.print(meyveler[i] + " kaç kilo? : ");
            kilolar[i] = scanner.nextDouble();
            toplamTutar += kilolar[i] * fiyatlar[i];
        }

        System.out.println("Toplam tutar: " + toplamTutar + " TL");

        scanner.close();
    }
}
