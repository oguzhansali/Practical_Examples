package Week_1.odev1;

import java.util.Scanner;// Scanner kullanimi için import edildi.

public class kitle_endeks {
    public static void main(String[] args) {// main blogu eklendi.
        // Değişkenler tanımlandi.
        double boy;
        double kilo;

        Scanner input = new Scanner(System.in);//Veri alimi için scanner tanımlandi.

        //Kullanicidan boy degeri alindi.
        System.out.println("Lütfen Boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        //Kullanicidan kilo degeri alindi.
        System.out.println("Lütfen Kilonuzu (Kilogram cinsinden) giriniz: ");
        kilo = input.nextDouble();
        //Indeks hesaplandi.
        double indeks =(kilo/(boy*boy));
        //Indeks ekrana yazdirildi.
        System.out.println("Vücut Kitle Indeksiniz: " + indeks);



    }
}
