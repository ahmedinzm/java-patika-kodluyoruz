import java.util.*;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        
        // Dizideki elemanları ve frekanslarını saklamak için bir Map oluşturuyoruz
        Map<Integer, Integer> frekanslar = new HashMap<>();
        
        // Dizideki her elemanın frekansını hesaplıyoruz
        for (int i = 0; i < dizi.length; i++) {
            // Eğer eleman daha önce görülmemişse, frekansı 1 olarak başlatıyoruz
            if (!frekanslar.containsKey(dizi[i])) {
                frekanslar.put(dizi[i], 1);
            } 
            // Eğer eleman daha önce görülmüşse, frekansı bir artırıyoruz
            else {
                int frekans = frekanslar.get(dizi[i]);
                frekanslar.put(dizi[i], frekans + 1);
            }
        }
        
        // Frekanslar ekrana yazdırılıyor
        for (int eleman : frekanslar.keySet()) {
            System.out.println(eleman + " sayısı " + frekanslar.get(eleman) + " kere tekrar edildi.");
        }
    }
}
