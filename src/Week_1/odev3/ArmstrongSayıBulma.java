package Week_1.odev3;

import java.util.Scanner;

public class ArmstrongSayıBulma {
    public static void main(String[] args) {
        int sayı;
        Scanner input = new Scanner(System.in);
        System.out.println("SAYI GIRINIZ: ");
        sayı = input.nextInt();

        int tempSayı = sayı; // Geçici olarak sayıyı saklayacağımız değişken
        int basamakSayısı = 0;
        int toplam = 0;

        // Girilen sayının basamak sayısını bulma
        while (tempSayı != 0) {
            basamakSayısı++;
            tempSayı /= 10;
        }

        // Sayının her bir basamağını toplamak
        tempSayı = sayı; // Geçici sayıyı sıfırlamak
        for (int i = 0; i < basamakSayısı; i++) {
            int basamakDeğeri = tempSayı % 10; // Son basamağı al
            toplam += basamakDeğeri; // Toplama ekle
            tempSayı /= 10; // Bir sonraki basamağa geç
        }

        System.out.println("Basamaklarının toplamı: " + toplam);
    }
}
