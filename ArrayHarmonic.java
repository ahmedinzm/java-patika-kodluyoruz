public class ArrayHarmonic {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Dizi
        double sum = 0.0; // Toplam değeri tutmak için değişken tanımlama

        // Elemanların harmonik serisini hesapla
        for (int i = 0; i < numbers.length; i++) {
            sum += (double)1/numbers[i];
        }

        // Harmonik ortalama hesabı
        double harmonicMean = numbers.length / sum;

        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);
    }
}
