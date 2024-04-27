package Week_1.odev3;

import java.util.Scanner;

public class BirYüzArasıAsalSayılar {
    public static void main(String[] args) {
        //Değişkenler ve scanner tanımlandı.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");//Kullanıcıdan veri alınması sağlandı.
        int sayi = input.nextInt();
        int toplam=0;//Geçici değer atandı.

        for (int i = 2; i <= sayi; i++) {//i arttırılarak girilen değere kadar kalansız bölünenelri toplama yapıdlı.
            if (sayi % i == 0) {
                i++;
                toplam += i;//Kalansız bölünenlere değişkene atandı.
            }
        }
        if (toplam==sayi+1){//Asal şartı olan 1 ve kendinden başka sayıya bölünmediğinden kalansız bölünenler toplam değişkenine atandı.
            //Sonuçlar yazdırıldı.
            System.out.println(sayi+ " Asal sayıdır.");
        }else {
            System.out.println(sayi + " Asal sayı değildir.");
        }

    }
}
