package Week_1.odev1;

import java.util.Scanner;// Scanner kullanimi için import edildi.

public class manav_kasa {
    public static void main(String[] args) {// main blogu eklendi.

        double a,e,d,m,p;//Değişkenler tanımlandı.
        // Değerler tanımlandı.
        double armut = 2.14;
        double elma = 3.67;
        double dom = 1.11;
        double muz = 0.95;
        double pat = 5.00;

        Scanner input = new Scanner(System.in);// veri almaya yarayan scanner tanımlandı.
        //Kullanıcıdan istenen veriler alindi.
        System.out.println("Kac Kilo Armut: ");
        a = input.nextDouble();

        System.out.println("Kac Kilo Elma: ");
        e  = input.nextDouble();

        System.out.println("Kac Kilo Domates: ");
        d = input.nextDouble();

        System.out.println("Kac Kilo Muz: ");
        m = input.nextDouble();

        System.out.println("Kac Kilo Patlıcan: ");
        p = input.nextDouble();

        //Fiyatlar hesaplandi.
        double ta = a*2.14;
        double te = e*3.67;
        double td = d*1.11;
        double tm = m*0.95;
        double tp = p*5.00;

        double toplam  = (ta + te + td + tm + tp);//Fiyatların Toplami hesaplandi.

        System.out.printf("Toplam Tutar:  " + toplam + " TL" );//Değerler Ekrana Yazdirildi.





    }
}
