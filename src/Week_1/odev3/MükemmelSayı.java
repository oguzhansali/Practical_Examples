package Week_1.odev3;

import java.util.Scanner;

public class MükemmelSayı {
    public static void main(String[] args) {
        //Degışkenler ve Scanner tanımlandı.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = input.nextInt();
        int toplam = 0;

//Girilen sayıya kadar kalansız bölünenlerin toplamı hesaplanarak toplam degerıne atandı.
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam +=i;
            }
        }
        //Eğer toplam deger girilen değere eşitse sayı Mükemmel sayıdır.
        if (toplam == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        }else {//Eşit değilse değildir.
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }

    }
}
