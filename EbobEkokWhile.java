import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        int ebob = 1;
        int ekok = (sayi1 * sayi2);

        int i = 2;
        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int j = ekok / sayi1;
        while (j % sayi2 != 0) {
            j += (ekok / sayi1);
        }
        ekok = j;

        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EBOB'u: " + ebob);
        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EKOK'u: " + ekok);
    }
}
