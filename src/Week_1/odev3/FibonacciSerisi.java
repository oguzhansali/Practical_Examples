package Week_1.odev3;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        //değişkenler tanımlandı.
        int n;
        int a= 0, b=1;
        //Pozitif sayı olacak şekilde değer alır.
        do {
            Scanner inp = new Scanner(System.in);
            System.out.println("Bir sayı giriniz.");
            n= inp.nextInt();
        }while (n<=0);

        System.out.println("Fibonocci Serisi");
        System.out.print(a+ " " + b + " ");//ilk iki sayı belli oldugundan yazdırılır.
        for (int i =2; i<n; i++){//2 den başlatılarak arttırılır.
            int c = a+b;//Yeni sayı diğer değerlerin toplamıdır.
            System.out.print(c + " ");//Yeni sayı ekrana yazdırılıyor
            a =b;
            b =c;

        }



    }
}