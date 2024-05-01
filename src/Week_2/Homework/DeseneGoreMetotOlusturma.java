package Week_2.Homework;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
//Girilen sayı negatif olana kadar  azaltılır ve negatif olunca tekrar geri arttırılır.
    public static void desen(int num) {
        if (num<=0){
            System.out.print(num + " ");
            return;
        }
        System.out.print(num+ " ");
        desen(num-5);

        System.out.print(num + " ");

    }
//Kullanıcıdan  sayı alınır ve işlem sonlandırılır ve sonuc ekrana yazdırılır.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int num = input.nextInt();
        input.close();
        desen(num);

    }
}
