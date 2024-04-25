package Week_1.Dersler;
import java.util.Scanner;

public class getting_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz:");
        int sayi1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        int sayi2 = scanner.nextInt();


        System.out.println("Ucuncu sayiyi giriniz:");
        int sayi3 = scanner.nextInt();

        // İkinci sayı sıfır mı diye kontrol ediyoruz
        if (sayi2 != 0) {
            double sonuc = (double) (sayi1 / sayi2)+ sayi3; // Double türüne dönüştürüyoruz
            System.out.println(" işleminin sonucu: " + sonuc);
        } else {
            System.out.println("Bir sayı sıfıra bölünemez!");
        }
    }

}
