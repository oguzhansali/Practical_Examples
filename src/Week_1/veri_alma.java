package Week_1;

import java.util.Scanner;

public class veri_alma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yas;
        Double maas ;


        System.out.println("Yaşınızı giriniz:");
        yas = input.nextInt();

        System.out.println("Maaşınızı giriniz:");
        maas = input.nextDouble();

        System.out.println("Adınızı giriniz:" );
        String ad = input.nextLine();

        System.out.println("Yaşınız: " + yas);
        System.out.println("Maşınız: " + maas);
        System.out.println("Adınız: " + ad);

    }
}