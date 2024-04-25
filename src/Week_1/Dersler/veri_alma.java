package Week_1.Dersler;

import java.util.Scanner;

public class veri_alma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yas;
        Double maas ;


        System.out.printf("Yaşınızı giriniz:");
        yas = input.nextInt();

        System.out.printf("Maaşınızı giriniz:");
        maas = input.nextDouble();

        System.out.println("Yaşınız: " + yas);
        System.out.printf("Maşınız: " + maas);


    }
}