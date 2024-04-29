package Week_2.Practices;

import java.util.Scanner;

public class PalindromSayılar {
    static boolean isPolindrom(int sayi) {//palindrom olup olmadıgını kontrol eden fonksiyon
        int temp = sayi, tersSayi = 0;
        //Sayının tersini bulan fonksiyon.
        while (temp != 0) {
            int sonSayi = temp % 10;
            tersSayi = (tersSayi * 10) + sonSayi;
            temp /= 10;
        }
        if (tersSayi == sayi) {
            System.out.println(sayi + " sayısı Palindrom sayıdır.");
        } else {
            System.out.println(sayi + " sayısı Palindrom sayı değildir.");
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");//Kullanıcıdan sayı girmesi sağlanır.
        int deger = input.nextInt();//Sayı degere atanır.
        isPolindrom(deger);


    }
}
