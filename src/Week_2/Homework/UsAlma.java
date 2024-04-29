package Week_2.Homework;

import java.util.Scanner;

public class UsAlma {
//Us alma işlemi gerçekleştirildi.
    static void usAlma (){
        int üst,taban;//Değişkenler tanımlandı.
        //Kullanıcıdan veriler alındı.
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değerini giriniz: ");
        taban= input.nextInt();
        System.out.println("Üst Değerini giriniz: ");
        üst= input.nextInt();
        int toplam =1;//Başlangıc değeri tanımlandı.
        if (üst>0){//Üs alma işlemini gerçekleştirelbilmek için
            for (int i=1;i<=üst;i++){
                toplam*=taban;
            }
            System.out.println("Sonuc : " + toplam);
        } else if (üst<0) {//Negatif üsler için tanımlandı.
            int absB=Math.abs(üst);
            for (int i=1;i<=absB;i++){
                toplam*=taban;
            }
            int sonuc = 1/toplam;
            System.out.println("Sonuc: " + sonuc);
        }else {
            System.out.println("Sonuc 0 dır.");
        }
    }
    public static void main(String[] args) {
        usAlma();

    }
}
