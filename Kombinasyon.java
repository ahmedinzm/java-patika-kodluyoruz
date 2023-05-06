import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        int nFaktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }

        int rFaktoriyel = 1;
        for (int i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }

        int nMinusRFaktoriyel = 1;
        for (int i = 1; i <= n - r; i++) {
            nMinusRFaktoriyel *= i;
        }

        int kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);

        System.out.println("C("+n+","+r +") = "+  kombinasyon);
    }
}
