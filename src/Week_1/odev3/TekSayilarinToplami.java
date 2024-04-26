package Week_1.odev3;

import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        //Degıskenler tanımladı.
        int i;
        int sum =0;
        Scanner input = new Scanner(System.in);
// Çift ve 4un katı olan çiftleri bulan kosul olusturuldu.
        do{
            System.out.print("Bir sayi giriniz :");
            i = input.nextInt();
            if (i%2==0&&i%4==0){
                sum+=i;

            }

        }while(i%2==0);//Bu koşul bozulana kadar çalışmaya devam edecek.
        System.out.println("Çift ve 4'ün katı sayıların toplamı : " + sum);//Çıktı yazdırıldı.



    }
}
