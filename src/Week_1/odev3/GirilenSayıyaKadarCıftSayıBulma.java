package Week_1.odev3;

import java.util.Scanner;

public class GirilenSayıyaKadarCıftSayıBulma {
    public static void main(String[] args) {
        //Degıskenler tanımlandı ve kullanıcıdan veri alındı.
        int k ;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        k = input.nextInt();
        //Sonuca ulaşıalcak döngü oluşturuldu.
        int i = 1;
        while (i<=k){
            i++;
            if (i % 2 == 0){
                System.out.println(i);//Sonuc yazdırıldı.
            }
        }

    }
}
