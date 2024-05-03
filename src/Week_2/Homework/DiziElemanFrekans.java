package Week_2.Homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DiziElemanFrekans {
    //Tekrar sayısını bulacak metod oluşturuldu.
    public static void tekrarBul(int[] list){
        Map<Integer, Integer> tekrar= new HashMap<>();//HashMap oluşturularak tekrar edildiğini saklamak için kullan ıldı.

        for (int sayi : list){//Dizi içindeki her  bir sayı işlendi.
            if(tekrar.containsKey(sayi)){//Eğer bir sayı tekrar ediyorsa tekrar etme sayısı arttırılarak Mape eklenir.
                tekrar.put(sayi,tekrar.get(sayi)+1);
            }else {
                tekrar.put(sayi,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: tekrar.entrySet()){//Her bir sayıın kaç kere yazıldığını gösterir.
            System.out.println(entry.getKey()+ " sayısı " + entry.getValue()+ " kere tekrar edildi.");
        }
    }
    //Dizi oluşturuldu ve tekrarBul metodundan değer çağrılarak ekrana yazdırıldı.
    public static void main(String[] args) {
        int[] list = {3,3,3,3,5,5,6,7,8,8};
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları :");
        tekrarBul(list);
    }
}
