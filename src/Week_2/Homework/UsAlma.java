package Week_2.Homework;

import java.util.Scanner;

public class UsAlma {
//Us alma işlemi gerçekleştirildi.
    static int  usAlma (int taban,int üst){
        if (üst==0){
            return  1;
        }else if (üst>0){
            return  taban*usAlma(taban,üst-1);
        }else {
            return 1/taban*usAlma(taban,-üst-1);
        }


    }
    public static void main(String[] args) {
        //Kullanıcıdan veriler alındı.
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değerini giriniz: ");
        int taban = input.nextInt();
        System.out.println("Üst Değerini giriniz: ");
        int üst = input.nextInt();

        int sonuc = usAlma(taban, üst);
        System.out.println("Sonuc: " + sonuc);

        input.close();


    }
}
