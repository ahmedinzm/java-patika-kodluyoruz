import java.util.HashMap;

public class ArrayrepeatingEvenNumbers {
    public static void main(String[] args) {
        int[] dizi = {2, 4, 3, 6, 8, 2, 4, 5, 8, 10, 12, 12, 14};
        
        // Her bir sayının kaç defa tekrar ettiğini tutacak olan HashMap tanımlanıyor
        HashMap<Integer, Integer> tekrarSayilari = new HashMap<>();
        
        // Dizideki her bir sayı için işlem yapılıyor
        for (int i = 0; i < dizi.length; i++) {
            int sayi = dizi[i];
            
            // Eğer sayı çift sayı değilse diğer sayılara bakmak üzere devam ediliyor
            if (sayi % 2 != 0) {
                continue;
            }
            
            // Sayının tekrar sayısını bir arttırıyoruz
            if (tekrarSayilari.containsKey(sayi)) {
                int tekrarSayisi = tekrarSayilari.get(sayi);
                tekrarSayilari.put(sayi, tekrarSayisi + 1);
            } else {
                tekrarSayilari.put(sayi, 1);
            }
        }
        
        // Tekrar eden çift sayılar ekrana yazdırılıyor
        System.out.println("Tekrar eden çift sayılar:");
        for (int sayi : tekrarSayilari.keySet()) {
            int tekrarSayisi = tekrarSayilari.get(sayi);
            if (tekrarSayisi > 1) {
                System.out.println(sayi + " (tekrar sayısı: " + tekrarSayisi + ")");
            }
        }
    }
}
