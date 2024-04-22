package ödev1;

import java.util.Scanner;

public class daire_alani {
    public static void main(String[] args) {
        double pi = 3.14;
        int r;
        double a;

        Scanner input = new Scanner(System.in);

        System.out.println("Yari Cap Degerini Giriniz: ");
        r = input.nextInt();

        System.out.println("Acı Degerini Giriniz: ");
        a = input.nextDouble();

        double alan = pi*r*r;
        double cevre = 2*pi*r;
        double aci = (pi*(r*r)*a)/360;

        System.out.println("Dairenin Alani: " + alan);
        System.out.println("Dairenin Cevresi: " + cevre);
        System.out.println("Açı Değeri " + a + " Olan Dairenin Alani: " + aci);


    }
}
