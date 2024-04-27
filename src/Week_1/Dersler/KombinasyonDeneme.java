package Week_1.Dersler;

import java.util.Scanner;

public class KombinasyonDeneme {
    public static void main(String[] args) {
        //Degiskenler tanımlandı.
        int n,r;
        int i =1;
        int sum1=1;
        int sum2=1;
        Scanner input = new Scanner(System.in);
//Kullanıcıdan veriler alındı.
        System.out.println("1.Sayıyı Giriniz: ");
        n= input.nextInt();
        System.out.println("2.Sayıyı Giriniz: ");
        r= input.nextInt();
        //Kombinasyon işlemini hesaplayan dongu olusturuldu.
        do {
            for (i=1; i<=n; i++){
                sum1*=i;
            }
            for (i=1; i<=r; i++){
                sum2*=i;
            }
            int kombinasyon = sum1/sum2;
            System.out.println(kombinasyon);//Sonuclar yazdırıldı.

        }while (i<=n && i<=r );//Bu kosul saglandı surece calısma kosulu.

    }
}
