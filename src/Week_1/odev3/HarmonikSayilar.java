package Week_1.odev3;

import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        //Degıskneler tanımladı.
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        sayi = input.nextInt();
        double toplam = 0;//Degiskende deger tanımlandı
//Pozitif sayı için harmonik hesaplama yapıldı.
        if (sayi > 0) {
            for (double i = 1.0; i <= sayi; i++) {
                toplam += 1.0 / i;
            }
            System.out.println(sayi + " Harmonik Sayısının  Toplamı :  " + toplam);
//Negatif sayı için harmonik hesaplama yapıldı.
        } else if (sayi < 0) {
            for (double i = -1.0; i >= sayi; i--) {
                toplam += 1.0 / i;
            }
            System.out.println(sayi + " Harmonik Sayısının Farkı :  " + toplam);
        } else {//0 olduğu kosul için sonuc yazıldı.
            System.out.println("Sonuc 1 dir.");
        }
    }
}
