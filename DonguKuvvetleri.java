import java.util.Scanner;
public class DonguKuvvetleri {
    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Değer giriniz: ");
        sayi = scanner.nextInt();


        for (int i = 1, j = 1;  i<= sayi && j<=sayi; i*=4, j*=5)
        {
            System.out.println("4'ün kuvvetleri : "+i +" \t"+ "5'in kuvvetleri: "+j);
        }


    }
}
