import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int gun,ay;
        String sonuc;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğdunuzu gün: ");
        gun = scanner.nextInt();

        System.out.print("Doğdunuz ay: ");
        ay = scanner.nextInt();


        if (ay == 1){
            sonuc = gun < 22 ?  "Oğlak" : "Kova";
        }else if (ay == 2){
            sonuc = gun < 20 ? "Kova" : "Balık";
        }else if (ay == 3){
            sonuc = gun < 21 ? "Balık" : "Koç";
        }else if (ay == 4){
            sonuc = gun < 21 ? "Koç" : "Boğa";
        }else if (ay == 5){
            sonuc = gun < 22 ? "Boğa" : "İkizler";
        }else if (ay == 6){
            sonuc = gun < 23 ? "İkizler" : "Yengeç";
        }else if (ay == 7){
            sonuc = gun < 22 ? "Yengeç" : "Aslan";
        }else if (ay == 8){
            sonuc = gun < 23 ? "Aslan" : "Başak";
        }else if (ay == 9){
            sonuc = gun < 22 ? "Başak" : "Terazi";
        }else if (ay == 10){
            sonuc = gun < 22 ? "Terazi" : "Akrep";
        }else if (ay == 11){
            sonuc = gun < 22 ? "Akrep" : "Yay";
        }else if (ay == 12){
            sonuc = gun < 22 ? "Yay" : "Oğlak";
        }else{
            sonuc = "Hatalı";
        }

        System.out.println("Burcunuz: "+ sonuc);


    }
}
