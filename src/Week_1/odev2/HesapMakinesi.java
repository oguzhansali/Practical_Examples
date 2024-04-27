package Week_1.odev2;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int a, b, select;//Degiskenler tanımladı.
//Kullanıcıdan degıskenler alıncı.
        Scanner input = new Scanner(System.in);
        System.out.print("1.Degeri giriniz: ");
        a = input.nextInt();
        System.out.print("2.Degeri giriniz: ");
        b = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("iŞLEMİNİZ:");
        select = input.nextInt();
//Koşul bloğu eklenerek dogru sonuc yazdırılması saglandı.
        switch (select) {
            case 1:
                System.out.println(a + " ve " + b + " sayılarının toplamı: " + (a + b));
                break;
            case 2:
                System.out.println(a + " ve " + b + " sayılarının farkı: " + (a - b));
                break;
            case 3:
                System.out.println(a + " ve " + b + " sayılarının çarpımı: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println(a + " ve " + b + " sayılarının bölümü: " + (a / b));
                } else {
                    System.out.println("Bir sayı 0 a bölünemez.");
                }
                break;
            default:
                System.out.println("Lutfen verilmiş olan değerlerden birini  seciniz.");
                break;
        }

    }
}
