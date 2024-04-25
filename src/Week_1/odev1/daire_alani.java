package Week_1.odev1;

import java.util.Scanner;//scanner import edildi.

public class daire_alani {
    public static void main(String[] args) {// main blogu eklendi.
        double pi = 3.14;//Pi  tanımlandı.
        //Değişkenler.
        int r;
        double a;

        Scanner input = new Scanner(System.in);//Veri alabilmek için scanner tanımlandı.
        //Kullanıcıdan yarıcap degeri alındı.
        System.out.println("Yaricap Degerini Giriniz: ");
        r = input.nextInt();
        //Kullanıcıdan acı degeri alındı.
        System.out.println("Acı Degerini Giriniz: ");
        a = input.nextDouble();

        double alan = pi*r*r;//Daire alan hesapla.
        double cevre = 2*pi*r;//Daire cevre hesapla.
        double aci = (pi*(r*r)*a)/360;//Verilen acı degerine göre alan hesapla.
        //Sonuclari ekrana yazdir.
        System.out.println("Dairenin Alani: " + alan);
        System.out.println("Dairenin Cevresi: " + cevre);
        System.out.println("Açı Değeri " + a + " Olan Dairenin Alani: " + aci);


    }
}
