package ödev1;


import java.util.Scanner;// kullanıcıdan veri alınması için scanner import edildi.


public class kdv_tutarı {

    public static void main(String[] args) {// kodun çalıştırılamsı çin main bloğu eklendi.
        int tutar ;// Değişken tanımlandı.

        Scanner inpput = new Scanner(System.in);// veri almaya yarayan scanner tanımlandı.

        System.out.println("Çekmek İstediğiniz Tutarı Giriniz: ");// Kullanıcıdan veri alma işlemi yapıldı.
        tutar = inpput.nextInt();// Alınan veri değişkene atandı.

        if(tutar<=1000 ) {//Alınan verinin koşulu sağlanıyormu diye bakıldı.
            int kdv = (int)(tutar * 0.18);//Koşul sağlandığında uygulanan adımlar.
            System.out.println("KDV'siz Fiyat: " + tutar);//Kulllanıcıya iletilen veri.
            System.out.println("Kdv Dahil Toplam Tutar: " + (kdv+ tutar));
            System.out.println("KDV tutarı: " + kdv);

        }else if (tutar>=1000){//Eğer ilk koşul sağlanmıyorsa uygulanan adım.
                int kdv =(int) (tutar*0.08);////Koşul sağlandığında uygulanan adımlar.
                System.out.println("KDV'siz Fiyat: " + tutar);//Kulllanıcıya iletilen veri.
                System.out.println("Kdv Dahil Toplam Tutar: " + (kdv+ tutar));
                System.out.println("KDV tutarı: " + kdv);


            }




    }
}
