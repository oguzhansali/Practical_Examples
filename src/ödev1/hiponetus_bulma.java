package ödev1;


import java.util.Scanner;// kullanıcıdan veri alınması için scanner import edildi.


public class hiponetus_bulma {
    public static void main(String[] args) {// kodun çalıştırılamsı çin main bloğu eklendi.
        int a, b, c;// Değişken tanımlandı.

        Scanner innput = new Scanner(System.in);// veri almaya yarayan scanner tanımlandı.

        System.out.println("1. Kenar Değerini Giriniz: ");// Kullanıcıdan veri alma işlemi yapıldı.
        a = innput.nextInt();// Alınan veri değişkene atandı.

        System.out.println("2. Kenar Değerini Giriniz: ");
        b = innput.nextInt();

        System.out.println("3. Kenar Değerini Giriniz: ");
        c = innput.nextInt();

        double u = (a+b+c)/2;//Değişken atandı.

        double cevre = 2*u;//Değişken atandı.
        System.out.println("Üçgenin Çevresi: " + cevre);//Cevre bulundu.

        double alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
        System.out.println("Üçgenin Alanı: " + alan);//Alan Bulundu.



    }
}
