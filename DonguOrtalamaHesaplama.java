import java.util.Scanner;
public class DonguOrtalamaHesaplama {
    public static void main(String[] args) {
        int sayi,i = 0, toplam = 0;
        double ortalama = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı gir: ");
        sayi = scanner.nextInt();

        while (i <= sayi){
            if (sayi %3 == 0 && sayi%4 == 0){
                toplam  = toplam+i;

            }
            i++;
        }
        System.out.println("0'dan " + sayi + "'e kadar olan sayılardan 3 ve 4'e tam bölünenlerin ortalaması: "+toplam / i);


    }
}
