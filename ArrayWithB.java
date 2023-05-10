public class ArrayWithB {
    public static void main(String[] args) {
        int boyut = 7; // Harfin boyutu
        
        // Boyut x boyutluk bir matris oluşturuyoruz
        char[][] matris = new char[boyut][boyut];
        
        // Matrisin her elemanını önce boşluk karakteri ile dolduruyoruz
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                matris[i][j] = ' ';
            }
        }
        
        // İlk satırı ve son satırı "*" karakteri ile dolduruyoruz
        for (int i = 0; i < boyut; i++) {
            matris[0][i] = '*';
            matris[boyut - 1][i] = '*';
        }
        
        // Sol sütunu ve sağ sütunu "*" karakteri ile dolduruyoruz
        for (int i = 0; i < boyut; i++) {
            matris[i][0] = '*';
            matris[i][boyut - 1] = '*';
        }
        
        // Orta kısımdaki "*"'ları ekliyoruz
        for (int i = 2; i < boyut - 2; i++) {
            matris[i][2] = '*';
            matris[i][boyut - 3] = '*';
        }
        
        // Matrisi ekrana yazdırıyoruz
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
