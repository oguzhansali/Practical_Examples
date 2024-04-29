package Week_2.Practices;

import java.util.Scanner;
public class GelişmişHesapMakinesi {
//Toplama işlemi yaptırıldı.Girilen değer kadar toplama yaptırıldı.
    static void toplama() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }else {
                result += number;
            }
            System.out.println("Sonuç : " + result);
        }
    }
//Çıkarma işlemi yaptırıdı.
    static void cıkarma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number;
        if (counter<=0){
            System.out.println("Geçersiz giriş! En az bir sayı girmelisiniz.");
            return;
        }
        int result = counter;;//Başlangıç değeri ilk girilen sayı olarak atandı.
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            result-=counter;
        }
        System.out.println("Sonuç : " + result);
    }
//Çarpma işlemi yaptırıldı.
    static void carpma() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {//Sayı adedi attırılarak girilen değerler çarptırıldı.
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }
//Bölme işlemi yaptırıldı.
    static void bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }
//Üs alma işlemi yaptırıldı.
    static void üsAlma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int alt = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int üst = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= üst; i++) {
            result *= alt;
        }

        System.out.println("Sonuç : " + result);
    }
//Faktöriyel işlemi yaptırıldı.
    static void faktoriyel() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;//Başlangıç değişkeni 1 olarak tanımlandı.

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    //Mod alma işlemi yaptırıldı.
    static void modAlma(){
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz :");
        int ilk = scan.nextInt();
        System.out.print("2.Sayıyı giriniz :");
        int son = scan.nextInt();
        int sonuc = ilk%son;
        System.out.println("Sonuc : " + sonuc);
    }
    //Alan ve cevre hesaplaması yapıldı.
    static void alanCevre(){
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz :");
        int uzunKenar = scan.nextInt();
        System.out.print("2.Sayıyı giriniz :");
        int kısaKenar = scan.nextInt();
        int alan = kısaKenar*uzunKenar;
        int cevre = alan*2;
        System.out.println("Alan : " + alan + " Cevre : " + cevre);
    }

//Yaptırılmak istenen işlem seçtirildi.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
//Seçilen işlemler diğer metotlardan alındı.Koşulu sağladığı sürece.
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cıkarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    üsAlma();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    alanCevre();
                    break;
                case 0:
                    System.out.println("ÇIKIŞ BAŞARILI.");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}