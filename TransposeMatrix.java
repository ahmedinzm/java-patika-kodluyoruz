public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}}; // örnek matris
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        // transpoze alma işlemi
        int[][] transposeMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        
        // orijinal matrisi yazdırma
        System.out.println("Matris : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        // transpozu yazdırma
        System.out.println("Transpoze : ");        
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
