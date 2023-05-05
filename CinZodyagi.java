import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        int dogumYili;
        String[] zodyagi = {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};
        Scanner scanner = new Scanner(System.in);


        System.out.println("Doğum yılınız giriniz: ");
        dogumYili = scanner.nextInt();

        for (int i=0; i<12;i++){
            if (dogumYili %12 == i){
                System.out.println("Çin Zodyağı Burcunuz: "+zodyagi[i]);
            }
        }


    }
}
