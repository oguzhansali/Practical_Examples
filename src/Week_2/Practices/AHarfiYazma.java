package Week_2.Practices;

public class AHarfiYazma {
    public static void main(String[] args) {
        String [][] list = new String[7][4];//Dizi oluşturuldu.

        for (int i=0; i< list.length;i++){//B harfini oluşturmak için oluşturulacak satır ve sütünlar oluşturuldu.
            for (int j = 0; j<list[i].length;j++){
                if (i==0 || i==3||i==6){//0,3ve 6. indekslerdeki satırları yıldılar ile doldurmak için oluşturuldu.
                    list[i][j]= " * ";
                } else if (j==0 || j==3){//0 ve 3. indekdeki sütunları doldurmak için oluşturuldu.
                    list[i][j]=" * ";
                }else {
                    list[i][j]="   ";
                }
            }
        }
        //Sütun ve satırlar yazdırıldı.
        for (String[] row: list){
            for (String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
