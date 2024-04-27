package Week_1.odev3;

import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        int num1,num2;//Değişkenler tanımlandı.
        //Kullanıcıdan veri alma işlemi yapıldı.
        Scanner input = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("2.sayıyı giriniz:");
        num2= input.nextInt();
        //Başlangıc degerleri tanımlandı.
        int i =1;
        int ebob=1;
//2.sayının küçük olması durumu.i değerinin num2 e kadar ortak bölen bulma işlemi yaptırır.
        if (num1>num2){
            while (i<=num2){
                for (i=1; i<=num2;i++ ){
                    if(num1%i==0 && num2%i==0){
                        ebob = i;//bulunan en buyuk ortak deger eboba atanır.
                    }
                }
                int ekok = (num1*num2)/ebob;//Ekok degıskenı tanımlanır.Sonuclar yazdırılır.
                System.out.println("İki sayının EBOB'u " + ebob + " dir.");
                System.out.println("İki sayının EKOK'u " + ekok +" dir.");
            }
        } else{//num2 nin buyuk olması durumu.
            while(i<=num1){
                for (i=1; i<=num1;i++){//küçük sayı num1 e değerine kadar ebob bulur.
                    if(num1%i==0 && num2%i==0){
                        ebob=i;//bulunan en buyuk ortak deger eboba atanır.
                    }
                }
                int ekok = (num1*num2)/ebob;//Ekok degıskenı tanımlanır.Sonuclar yazdırılır.
                System.out.println("İki sayının EBOB'u " + ebob+ " dir.");
                System.out.println("İki sayının EKOK'u " + ekok +" dir.");
            }
        }


    }
}
