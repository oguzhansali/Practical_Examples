package ödev1;

import java.util.Scanner;// kullanıcıdan veri alınması için scanner import edildi.

public class taksimetre {
    public static void main(String[] args) {// kodun çalıştırılamsı çin main bloğu eklendi.

        int km;// Değişken tanımlandı.
        int acılıs = 10;
        int min_ödeme = 20;
        Scanner inp = new Scanner(System.in);// veri almaya yarayan scanner tanımlandı.

        System.out.println("Gidilen yol: ");// Veri alındı.
        km = inp.nextInt();//  Alınan değişken tanımlandı.

        //double acılıs = 10;// Değişken tanımlandı.
        double tutar = (km*2.20)+ acılıs;// Değişken tanımlandı.

        if(tutar < 20){//Tutara göre fiyat belirlemesi yapıldı.
            System.out.println("Ödenecek Tutar: " + (min_ödeme) + " TL dir.");


        }else if (tutar>20){
            System.out.println("Ödenecek Tutar: " + (tutar)+ " TL dir." );
        }

    }
}
