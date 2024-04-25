package Week_1.Dersler;

import java.util.Scanner;

public class sınıf_gecmedurumu {
    public static void main(String[] args) {
        int a, b, c, d,  e;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz : ");
        a= input.nextInt();
        System.out.println("Fizik notunuzu giriniz : ");
        b = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz : ");
        c = input.nextInt();
        System.out.println("Kimya notunuzu giriniz : ");
        d = input.nextInt();
        System.out.println("Müzik notunuzu giriniz : ");
        e = input.nextInt();
        double total = 0;
        double count = 0;
        if(a>=0 && a<=100){
            total+=a;
            count++;
        }else {
            System.out.println("Geçersiz Matematik Notu girdiniz!");
        }
        if(b>=0&&b<=100){
            total+=b;
            count++;
        }else {
            System.out.println("Geçersiz Fizik Notu Girdiniz!");
        }
        if(c>=0&&c<=100){
            total+=c;
            count++;

        }else {
            System.out.println("Geçersiz Türkçe Notu Girdiniz!");
        }
        if(d>=0&&d<=100){
            total+=d;
            count++;
        }else{
            System.out.println("Geçersiz Kimya Notu Girdiniz!");
        }
        if(e>=0&&e<=100){
            total+=e;
            count++;
        }else{
            System.out.println("Geçersiz Müzik Notu Girdiniz!");
        }

        double avarage = total/count;
        System.out.println("Ortalamanız:" + avarage);




    }
}
