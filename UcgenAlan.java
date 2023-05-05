import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        int a,b,c,u;
        double alan;
        Scanner scanner = new Scanner(System.in);

        System.out.println("A Kenarını giriniz: ");
        a = scanner.nextInt();

        System.out.println("B Kenarını giriniz: ");
        b = scanner.nextInt();

        System.out.println("C Kenarını giriniz: ");
        c = scanner.nextInt();

        u = (a+b+c) / 2;

        alan =Math.sqrt(u * (u-a) * (u-b) * (u-c));


        System.out.println("Üçgenin alanı: "+alan);





    }
}
