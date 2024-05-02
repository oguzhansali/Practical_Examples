package Week_2.Practices;

import java.util.Arrays;

public class DiziMaxMin {
    public static void main(String[] args) {
        int[] list = {-33,-34,44,56,203,123};//Dizi oluşturuldu.
        //Minumum ve maximum değerleri bulmak için başlangıç değerleri 0. indeks olarak belirlendi.
        int min = list[0];
        int max = list[0];
        //Foreach kullanılarak başlangıçtaki min ve max değerleri liste içindeki sayılarla karşılaştırıldı.
        for (int i:list){
            if (i<min){
                min=i;
            }
            if (i>max){
                max=i;
            }
        }
        //Sonuçlar ekrana yazıldı.
        System.out.println(Arrays.toString(list));
        System.out.println("Girilen değer sayısı : "+list.length);
        System.out.println("Minumum değer: " + min);
        System.out.println("Maximum değer : " + max);
    }
}
