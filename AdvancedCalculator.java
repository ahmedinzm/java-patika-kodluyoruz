import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        double result = 0.0;

        while (choice != 0) {
            // Menüyü göster
            showMenu();

            // Kullanıcının seçimini al
            System.out.print("Seçiminiz: ");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> result = addition();
                case 2 -> result = subtraction();
                case 3 -> result = multiplication();
                case 4 -> result = division();
                case 5 -> result = exponentiation();
                case 6 -> result = factorial();
                case 7 -> result = modulus();
                case 8 -> rectangle();
                case 0 -> System.out.println("Çıkış yapıldı.");
                default -> System.out.println("Geçersiz Seçenek!");
            }

            if (choice > 0 && choice < 8) {
                System.out.println("Sonuç: " + result);
            }
        }
    }

    // Menüyü gösteren fonksiyon
    public static void showMenu() {
        System.out.println("\n-- Gelişmiş Hesap Makinesi --");
        System.out.println("1- Toplama İşlemi");
        System.out.println("2- Çıkarma İşlemi");
        System.out.println("3- Çarpma İşlemi");
        System.out.println("4- Bölme İşlemi");
        System.out.println("5- Üslü Sayı Hesaplama");
        System.out.println("6- Faktöriyel Hesaplama");
        System.out.println("7- Mod Alma");
        System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı");
        System.out.println("0- Çıkış Yap");
    }

    // Toplama işlemini yapan fonksiyon
    public static double addition() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayı: ");
        double num1 = input.nextDouble();
        System.out.print("İkinci Sayı: ");
        double num2 = input.nextDouble();
        return num1 + num2;
    }

    // Çıkarma işlemini yapan fonksiyon
    public static double subtraction() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayı: ");
        double num1 = input.nextDouble();
        System.out.print("İkinci Sayı: ");
        double num2 = input.nextDouble();
        return num1 - num2;
    }

    // Çarpma işlemini yapan fonksiyon
    public static double multiplication() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayı: ");
        double num1 = input.nextDouble();
        System.out.print("İkinci Sayı: ");
        double num2 = input.nextDouble();
        return num1 * num2;
    }

    // Bölme işlemini yapan fonksiyon
    public static double division() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayı: ");
        double num1 = input.nextDouble();
        System.out.print("İkinci Sayı: ");
        double num2 = input.nextDouble();

        if (num2 == 0) {
            System.out.println("Hata: Sıfıra Bölme!");
            return 0.0;
        }

        return num1 / num2;
    }

    // Üslü sayı hesaplayan fonksiyon
    public static double exponentiation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Sayı: ");
        double base = input.nextDouble();
        System.out.print("Üs: ");
        double exponent = input.nextDouble();
        return Math.pow(base, exponent);
    }

    // Faktöriyel hesaplayan fonksiyon
    public static double factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int num = input.nextInt();

        if ( num < 0) {
            System.out.println("Hata: Geçersiz Giriş!");
            return 0.0;
        }

        double result = 1.0;

        for (int i = 2; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    // Mod alma işlemini yapan fonksiyon
    public static double modulus() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayı: ");
        double num1 = input.nextDouble();
        System.out.print("İkinci Sayı: ");
        double num2 = input.nextDouble();

        if (num2 == 0) {
            System.out.println("Hata: Sıfıra Bölme!");
            return 0.0;
        }

        return num1 % num2;
    }

    // Dikdörtgen alan ve çevre hesaplayan fonksiyon
    public static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Uzunluk: ");
        double length = input.nextDouble();
        System.out.print("Genişlik: ");
        double width = input.nextDouble();
        double area = length * width;
        double perimeter = 2.0 * (length + width);
        System.out.println("Alan: " + area);
        System.out.println("Çevre: " + perimeter);
    }
}
