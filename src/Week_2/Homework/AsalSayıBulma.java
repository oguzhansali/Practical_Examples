package Week_2.Homework;

import java.util.Scanner;

public class AsalSayıBulma {

    static void isAsalmi(){
        //Kullanıcıdan veri alındı ve değişken tanımlandı.
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.print("Bir sayı giriniz: ");
            num = input.nextInt();
            boolean asal =true;//Girilen her değer ilk başta asal kabul edildi.

            for (int i =2; i<=num/2; i++){//i birer arttırıalrak girilen sayıya tam bölünuoymr kontrol edildi.
                if (num%i==0){
                    asal=false;//Bolunuyorsa asal değildir.
                    break;//durur.
                }
            }
            if (asal){//Asalsa.
                System.out.println(num + " asaldır.");
            }else {//Asal değilse.
                System.out.println(num + " asal değildir.");
            }
        }while (num!=0);


    }

    public static void main(String[] args) {
            isAsalmi();//isAsalmi metotunadn çıktı çağrılır
    }
}
