package Week_1.odev3;
public class BirYüzArasıAsalSayılar {

    public static void main(String[] args) {
        for (int sayi = 2; sayi <= 100; sayi++) {//100e kadar tüm sayılar kontro ledilir
            boolean asalMi = true;//Başlangıçta her deger asal kabul edilir.

            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {//Sayi i bölünuyorsa asal kabul edilmez döngügen çıakrılır.
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {//i ye bölünmuyorsa asal kabul edilir.
                System.out.print(sayi + " ");
            }
        }
    }
}
