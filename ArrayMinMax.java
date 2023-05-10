import java.util.Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        int girilenSayi = 5;
        
        Arrays.sort(dizi); // Diziyi sıralıyoruz
        
        int enBuyukEnYakin = Integer.MAX_VALUE; // Başlangıç değerleri
        int enKucukEnYakin = Integer.MIN_VALUE;
        
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < girilenSayi && dizi[i] > enKucukEnYakin) {
                enKucukEnYakin = dizi[i]; // Daha yakın bir sayı bulduk
            } else if (dizi[i] > girilenSayi && dizi[i] < enBuyukEnYakin) {
                enBuyukEnYakin = dizi[i];
            }
        }
        
        System.out.println("Girilen sayı : " + girilenSayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + enKucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + enBuyukEnYakin);
    }
}
