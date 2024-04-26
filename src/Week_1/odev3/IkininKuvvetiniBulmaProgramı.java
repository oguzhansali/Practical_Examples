package Week_1.odev3;

import java.util.Scanner;

public class IkininKuvvetiniBulmaProgramı {
    public static void main(String[] args) {
        //Degıskenler tanımlandı.
        int i=1;
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        sayi = inp.nextInt();
        //4ün ve 5in katlarını girilen degere kadar yazdıran kosul olusturuldu.
        while(i<sayi){
            for(i =1;i<sayi;i*=4){
                System.out.println("4 ün kuvvetleri : " + i);//Sonuclar yazdırıldı.
            }
            for (i=1; i<sayi; i*=5) {
                System.out.println("5in kuvvetleri: " + i);//Sonuclar yazdırıldı.
            }
        }

    }
}
