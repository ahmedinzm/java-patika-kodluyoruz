import java.util.Scanner;

public class RecursiveNumberManipulation {
    static void rempoveFive(int a, int temp) {

        if (a > 0) {
            System.out.print(a + " ");
            rempoveFive(a - 5, temp);
        } else if (a <= 0) {
            addFive(a, temp);
        }
    }

    static void addFive(int a, int temp) {
        if (temp >= a) {
            System.out.print(a + " ");
            addFive(a + 5, temp);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = scan.nextInt();
        int temp = a;
        rempoveFive(a, temp);
    }
}
