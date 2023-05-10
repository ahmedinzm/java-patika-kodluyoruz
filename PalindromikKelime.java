import java.util.Scanner;

public class PalindromikKelime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.next();
        boolean palindromik = true;

        for (int i = 0; i < kelime.length() / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(kelime.length() - 1 - i)) {
                palindromik = false;
                break;
            }
        }

        if (palindromik) {
            System.out.println(kelime + " kelimesi palindromiktir.");
        } else {
            System.out.println(kelime + " kelimesi palindromik değildir.");
        }
    }
}
