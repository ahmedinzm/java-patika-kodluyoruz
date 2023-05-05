import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        yil  = scanner.nextInt();

        if (yil %400 == 0){
            System.out.println(yil+ " Artık bir yıldır");
        }else{
            System.out.println(yil+" Artık bir yıl değildir");
        }
    }
}
