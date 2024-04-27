package Week_1.odev3;

import java.util.Scanner;

public class TipDönüşümleri {
    public static void main(String[] args) {
        int sayi;//Kullanıcıdan alına veri tanımlandı.
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Bir sayı giriniz:");
            sayi = input.nextInt();

            double a =sayi ;//int sayi değeri a ya atanarak double  veri tipine dönüştürülerek ekrana yazdırıldı.
            System.out.println("double veri tipi için değer : " + a);

            long c = sayi;//int sayi değeri c ye atanarak long  veri tipine dönüştürülerek ekrana yazdırıldı.
            System.out.println("long veri tipi için değer : " + c);

            short d = (short) sayi;//int sayi değeri c ye atanarak short  veri tipine dönüştürülerek ekrana yazdırıldı.
            System.out.println("shor veri tipi için değer : " + d);


        }while (sayi<0);

    }
}
