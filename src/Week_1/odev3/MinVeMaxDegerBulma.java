package Week_1.odev3;

import java.util.Scanner;

public class MinVeMaxDegerBulma {
    public static void main(String[] args) {
        //Değişkenler tanımlandı.
        int i;
        int sayi;
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kaç adet sayı gireceği bilgisi alınır.
        do {
            System.out.println("Kaç tane sayı gireceksiniz:");
            sayi = input.nextInt();
        } while (sayi <= 0); // sayı negatif veya sıfır olana kadar devam eder.

        int[] sayilar = new int[sayi];

        // Sayıları kullanıcıdan alın ve diziye kaydeder.
        for (i = 0; i < sayi; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz:");
            sayilar[i] = input.nextInt();
        }

        // En küçük ve en büyük sayıları bulur.
        int min = sayilar[0];
        int max = sayilar[0];
        for (i = 1; i < sayi; i++) {
            if (sayilar[i] < min) {
                min = sayilar[i];
            }
            if (sayilar[i] > max) {
                max = sayilar[i];
            }
        }

        // En küçük ve en büyük sayıları yazdırır.
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
