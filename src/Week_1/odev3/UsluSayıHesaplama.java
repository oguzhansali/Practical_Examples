package Week_1.odev3;

import java.util.Scanner;

public class UsluSayıHesaplama {
    public static void main(String[] args) {
        //Degıskenler atandı.Kullanıcıdan veriler alındı.
        int a, b;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz : ");
        b = input.nextInt();
        //Girilen deger için çalısma kosullari atandi ve degiskenlere atandı.
        if (b > 0) {
            for (int i = 1; i <= b; i++) {
                total *= a;
            }
            System.out.println("SONUC : " + total);
        } else if (b < 0) {
            int absB = Math.abs(b);//Negatif deger pozitife cevrildi.
            for (int i = 1; i <= absB; i++) {
                total *= a;
            }
            double ters = 1.0 / total;
            System.out.println("SONUC: " + ters);
        } else {
            System.out.println("SONUC : 1 dir.");
        }
    }
}
