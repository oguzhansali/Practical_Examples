package Week_1;

import java.util.Scanner;

public class sabitler {
    public static void main(String[] args) {
        final double pi = 3.14;
        double radius;

        Scanner innput = new Scanner(System.in);

        System.out.println("Lutfen Radius degerini giriniz: ");
        radius = innput.nextDouble();

        double area = pi*(radius*radius);

        System.out.println("Alan : " + area);

    }
}
