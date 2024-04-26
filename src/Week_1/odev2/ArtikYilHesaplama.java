package Week_1.odev2;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        //Degıskenler tanımlanı.Kullancıdan veriler alındı.
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        year = input.nextInt();
//Kosulun saglanması kontrol edildi.Sonuc yazdırıldı.

        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println(year + " Artık Yıldır.");

        }else {
            System.out.println(year + " Artık Yıl Değildir.");
        }




    }
}
