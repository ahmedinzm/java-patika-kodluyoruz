import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int alt, ust, toplam = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Alttaki sayıyı giriniz : ");
        alt = scanner.nextInt();

        System.out.print("Üstteki sayıyı giriniz : ");
        ust = scanner.nextInt();

        for (int i = 1; i <= ust; i++) {
            toplam *= alt;
        }
        System.out.print(alt +"^"+ ust + "= "+ toplam);
    }
}
