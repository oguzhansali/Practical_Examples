package Week_1.odev1;

import java.util.Scanner;

public class AritmetikIslemlerVeIslemOnceliği {
    public static void main(String[] args) {
        double a, b, c;
        Scanner innput = new Scanner(System.in);

        System.out.println("A sayısını giriniz: ");
        a = innput.nextDouble();

        System.out.println("B sayısını giriniz: ");
        b = innput.nextDouble();

        System.out.println("C sayısını giriniz: ");
        c = innput.nextDouble();

        double işlem = a+b*c-b;

        System.out.println(işlem);


    }
}
