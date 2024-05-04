package Week_2.Homework;

public class MatrisTranspozu {
    public static void main(String[] args) {
        //Matris Tanımlandı.
        int[][] matris = {
                {2,3,4},
                {5,6,7}
        };
        //Matrisin boyutunu al.
        int rows = matris.length;
        int columns = matris[0].length;
        //Transpoz matrisi oluşturuldu.
        int[][] transpoze = new int[columns][rows];

        //Matris transpozunu hesaplar.
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                transpoze[j][i]=matris[i][j];
            }
        }
        //Matris ve Transpoz çıktısını yazdırır.
        System.out.println("Matris: ");
        matrixYazdır(matris);
        System.out.println("\nTranspoz: ");
        matrixYazdır(transpoze);
    }

    //Matrisi ekrana yazdırır.
    public static void matrixYazdır (int[][] matrix){
        for(int i = 0; i< matrix.length;i++){
            for (int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
